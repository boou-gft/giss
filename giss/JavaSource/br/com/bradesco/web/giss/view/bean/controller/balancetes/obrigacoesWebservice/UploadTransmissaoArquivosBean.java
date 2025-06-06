package br.com.bradesco.web.giss.view.bean.controller.balancetes.obrigacoesWebservice;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

import javax.faces.model.SelectItem;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.codec.binary.Base64;
import org.apache.myfaces.custom.fileupload.UploadedFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.bradesco.web.aq.application.error.BradescoViewException;
import br.com.bradesco.web.aq.application.error.BradescoViewException.BradescoViewExceptionActionType;
import br.com.bradesco.web.aq.application.log.ILogManager;
import br.com.bradesco.web.aq.application.pdc.adapter.exception.PdcAdapterFunctionalException;
import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.TransmissaoArquivoLogDTO;
import br.com.bradesco.web.giss.service.business.dependencia.IDependenciaService;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasMunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.ILogTransmissaoArquivoService;
import br.com.bradesco.web.giss.service.business.logtransmissaoarquivo.exception.LogTransmissaoArquivoException;
import br.com.bradesco.web.giss.service.business.parametrizacaodependencia.bean.ParametrizacaoDepDTO;
import br.com.bradesco.web.giss.service.business.parametrizardependencia.IParametrizarDependenciaService;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

public class UploadTransmissaoArquivosBean {

	private IDependenciaService dependenciaImpl = (IDependenciaService) FacesUtils
			.getManagedBean("dependenciaImpl");

	private List<EstadosComboBean> listaEstados;
	private List<SelectItem> comboEstados;// lista do combo de estados
	private String estadoSelecionado;

	private List<SelectItem> comboMunicipiosPorEstado;
	private List<MunicipioDTO> listaMunicipiosPorEstado;
	private String municipioSelecionado;

	private List<DependenciasMunicipioDTO> listaDependenciasMunicipio;// lista
																		// dependencias
																		// por
																		// municipio
	private List<SelectItem> comboDependencias;
	private DependenciasMunicipioDTO dependenciaMunicipio;
	private String dependenciaSelecionada;

	private String tipoArquivo;

	private UploadedFile uploadedFile;
	private String nomeArquivo;

	private ILogTransmissaoArquivoService logTransmissaoArquivoServiceImpl;

	private IParametrizarDependenciaService parametrizarDependenciaServiceImpl;

	private boolean nomeArquivoDesabilitado;

	private ILogManager logger = BradescoCommonServiceFactory.getLogManager();
	
	public String inicializaUploadTransmissaoArquivosBean() {
		listaEstados = new ArrayList<EstadosComboBean>();
		comboEstados = new ArrayList<SelectItem>();
		estadoSelecionado = "";

		comboMunicipiosPorEstado = new ArrayList<SelectItem>();
		listaMunicipiosPorEstado = new ArrayList<MunicipioDTO>();
		municipioSelecionado = "";

		listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>();
		comboDependencias = new ArrayList<SelectItem>();
		dependenciaMunicipio = new DependenciasMunicipioDTO();
		dependenciaSelecionada = "";

		tipoArquivo = null;
		nomeArquivoDesabilitado = true;

		carregaComboEstados();
		return "uploadTransmissaoArquivos";
	}

	public List<SelectItem> carregaComboEstados() {
		
		resetMunicipios();
		try {
			// Chama classe de servico para preenchimento do combo de Estados
			listaEstados = dependenciaImpl.listagemEstados();

			comboEstados = GissUtil.carregaComboEstados(listaEstados);

			return comboEstados;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	/**
	 * Carrega a lista de municípios para o estado selecionado
	 * 
	 * @author jonascc
	 */
	public void carregarComboMunicipios() {
		comboMunicipiosPorEstado = new ArrayList<SelectItem>();
		municipioSelecionado = "";

		resetDependencias();

		try {
			if (!estadoSelecionado.equals("")) {

				listaMunicipiosPorEstado = dependenciaImpl
						.listarMunicipiosComLoop(estadoSelecionado);

				if (listaMunicipiosPorEstado != null) {
					// Ordena os municípios em ordem alfabética
					Collections.sort(listaMunicipiosPorEstado,
							new Comparator<MunicipioDTO>() {
								public int compare(MunicipioDTO elem1,
										MunicipioDTO elem2) {
									if (elem1.getNome() != null
											&& elem2.getNome() != null) {
										return elem1.getNome().compareTo(
												elem2.getNome());
									}
									return (elem1.getNome() == null) ? 1 : -1;
								}
							});

					for (int i = 0; i < listaMunicipiosPorEstado.size(); i++) {
						comboMunicipiosPorEstado.add(new SelectItem(
								listaMunicipiosPorEstado.get(i).getCodigo(),
								listaMunicipiosPorEstado.get(i).getNome()));
					}
				}

			}
			
			limparFile();
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	/**
	 * Carrega a lista de dependências para o município selecionado
	 * 
	 * @author jonascc
	 * @throws PdcAdapterFunctionalException
	 */
	public void carregarDependencias() {
		comboDependencias = new ArrayList<SelectItem>();
		dependenciaSelecionada = "";

		try {
			listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>();

			if (!municipioSelecionado.equals("")) {
				dependenciaMunicipio = dependenciaImpl
						.listarDependenciasMunicipio(
								municipioSelecionado, 0, "0");

				listaDependenciasMunicipio = dependenciaMunicipio
						.getDepMunicipio();

				if (listaDependenciasMunicipio != null) {
					// Ordena as dependências em ordem alfabética
					Collections.sort(listaDependenciasMunicipio,
							new Comparator<DependenciasMunicipioDTO>() {
								public int compare(
										DependenciasMunicipioDTO elem1,
										DependenciasMunicipioDTO elem2) {
									if (elem1.getDescricaoDependencia() != null
											&& elem2.getDescricaoDependencia() != null) {
										return elem1
												.getDescricaoDependencia()
												.compareTo(
														elem2.getDescricaoDependencia());
									}
									return (elem1.getDescMunicipio() == null) ? 1
											: -1;
								}
							});
						
					for (int i = 0; i < listaDependenciasMunicipio.size(); i++) {
						comboDependencias.add(new SelectItem(
								listaDependenciasMunicipio.get(i)
										.getCodigoDependencia(),listaDependenciasMunicipio.get(i)
										.getCodigoDependencia() + " - " +
								listaDependenciasMunicipio.get(i)
										.getDescricaoDependencia()));
					}
				}

			}

			limparFile();
		} catch (PdcAdapterFunctionalException p) {
			listaDependenciasMunicipio = new ArrayList<DependenciasMunicipioDTO>();
			BradescoFacesUtils.addInfoModalMessage(p.getMessage(),
					"manterDependencia",
					BradescoViewExceptionActionType.ACTION, false);
			return;
		} catch (Exception e) {
			throw new BradescoViewException(e.getMessage(), e, null);
		}

	}

	/**
	 * Redefine a lista de dependências e a dependência selecionada.
	 * 
	 * @author jonascc
	 */
	public void resetDependencias() {
		comboDependencias = new ArrayList<SelectItem>();
		dependenciaSelecionada = "";
	}
	
	public void resetMunicipios() {
		comboMunicipiosPorEstado = new ArrayList<SelectItem>();
		municipioSelecionado = "";
	}

	/**
	 * Apaga o nome do arquivo selecionado na tela.
	 * 
	 * @author jonascc
	 */
	public String limparFile() {
		if (!estadoSelecionado.equals("") && !municipioSelecionado.equals("")
				&& !dependenciaSelecionada.equals("") && tipoArquivo != null) {
			nomeArquivoDesabilitado = false;
		} else {
			nomeArquivoDesabilitado = true;
		}
		return null;
	}

	public String transmitir() {
		String nomeArquivo = uploadedFile.getName();
		InputStream xmlInputStream = null;
		
		try {
			String contentType = uploadedFile.getContentType();
			if (!contentType.equals("text/xml")) {
				String erroFormato = "";
				BradescoFacesUtils.addErrorModalMessage(erroFormato);
				throw new IOException("Formato não suportado. Escolha um arquivo xml.");
			}
			
			String chavePrivada = obterChavePrivada();

			// Carrega o arquivo xml
			xmlInputStream = uploadedFile.getInputStream();

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlInputStream);

			String dataHora = extraiDataInformacao(document);
			String cnpjDependencia = extraiCnpj(document);

			// Gera o hash ("ChaveSeguranca")
			String stringFormadora = cnpjDependencia + chavePrivada + dataHora;
			String hash = gerarHashBase64(stringFormadora);

			NodeList nodeList;
			Node root;
			// Obtém o elemento raiz
			// tipoArquivo 1 -> Lançamento 
			// tipoArquivo 2 -> Plano de contas
			if (tipoArquivo.equals("1")) {
				nodeList = document.getElementsByTagName("DeclaracaoMensalISSBanco");
				root = nodeList.item(0);
			} else {
				nodeList = document.getElementsByTagName("DescritivoPlanoDeContas");
				root = nodeList.item(0);
			}

			if (root == null) {
				throw new IOException("Arquivo xml inválido. Verifique se o arquivo escolhido corresponde ao tipo selecionado.");
			}

			// Obtém o elemento "Producao"
			NodeList nodeList2 = document.getElementsByTagName("Producao");
			Node nodeProducao = nodeList2.item(0);

			// Adiciona o elemento "ChaveSeguranca" no arquivo xml
			Node nodeChaveSeguranca = document.createElement("ChaveSeguranca");
			nodeChaveSeguranca.appendChild(document.createTextNode(hash));
			root.insertBefore(nodeChaveSeguranca, nodeProducao);

			// Converte o xml com o elemento "ChaveSeguranca" adicionado em String
			String conteudoArquivoModificado = convertXmlToString(document);

			salvarTrasmissao();

			String urlWebservice = getUrlWebservice();
			String url = recuperarUrl();
			String response = null;
			
			try {
				HttpPostMultipart multipart = new HttpPostMultipart(
						urlWebservice, "utf-8", url);
				logger.info(multipart, "DESTINO_URL: " + url);
				multipart.addFilePart("Arquivo", conteudoArquivoModificado,
						nomeArquivo);
				logger.info(multipart, "Conteudo modificado: " + conteudoArquivoModificado);
				logger.info(multipart, "Nome do arquivo: " + nomeArquivo);
				response = multipart.finish();
			} catch (Exception e) {
				logger.info(this.getClass(), "Mensagem: " + e.getMessage());
				logger.error(this.getClass(), e);
				registrarLogTransmissaoArquivo(4, e.getMessage());
				logger.info(this.getClass(), "Situação Inconsistente registrada com sucesso.");
				throw new IOException(e.getMessage());
			}

			Document responseXml = parseResponse(response);

			// verifica se o retorno possui a tag "ListaDeErros" e salva seu
			// valor caso exista
			boolean hasError = salvarResponseError(responseXml);

			if (!hasError) {
				if (tipoArquivo.equals("1")) {
					salvarResponseLancamento();
				} else {
					salvarResponsePlanoContas(responseXml);
				}
			}

			BradescoFacesUtils.addInfoModalMessage("Arquivo enviado.", false);
		} catch (IOException e) {
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		} catch (LogTransmissaoArquivoException e) {
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		} catch (Exception e) {
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			BradescoFacesUtils.addErrorModalMessage(e.getMessage());
		} finally {
	        if (xmlInputStream != null) {
	            try {
	                xmlInputStream.close();
	            } catch (IOException e) {
	                logger.error("Erro ao fechar o InputStream do arquivo XML.", e);
	            }
	        }
	    }
		return "uploadTransmissaoArquivos";
	}

	/**
	 * @author jonascc
	 * @return A url cadastrada na tela de parametrização junto com a chave privada.
	 * @throws LogTransmissaoArquivoException
	 */
	private String recuperarUrl() {
		ParametrizacaoDepDTO retorno = new ParametrizacaoDepDTO();
		try {
			Long codMunicipio = Long.valueOf(municipioSelecionado);
			Integer nSeqUnOrg = retornarNumSequencial(dependenciaSelecionada);
			Long codEmpresa = retornarCodEmpresa(dependenciaSelecionada);
			
			retorno = parametrizarDependenciaServiceImpl
			.consultarParametrizacao(codMunicipio,
					codEmpresa,
					nSeqUnOrg);
			
		} catch(Exception e) {
			throw new LogTransmissaoArquivoException(
					"Erro ao buscar a URL cadastrada.", e);
		}
		return retorno.getUrl();
		
	}
	/**
	 * @author jonascc
	 * @param document
	 * @return O arquivo xml representado pelo tipo Document convertido em
	 *         String
	 * @throws TransformerException
	 */
	private String convertXmlToString(Document document)
			throws LogTransmissaoArquivoException {
		try {
			DOMSource domSource = new DOMSource(document);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			return writer.toString();
		} catch (Exception e) {
			throw new LogTransmissaoArquivoException(
					"Erro ao processar o arquivo xml.", e);
		}
	}

	/**
	 * Retorna o conteúdo de "DataInformacao" do arquivo xml
	 * 
	 * @author jonascc
	 * @param
	 * @return O conteúdo da tag DataInformacao presente no arquivo xml
	 * @throws IOException
	 */
	private String extraiDataInformacao(Document document) throws IOException {
		NodeList nodeListData = document.getElementsByTagName("DataInformacao");
		if (nodeListData != null && nodeListData.getLength() > 0
				&& nodeListData.item(0).getFirstChild() != null) {
			return nodeListData.item(0).getFirstChild().getNodeValue();
		} else {
			throw new IOException(
					"Campo \"DataInformacao\" não encontrado no arquivo.");
		}
	}

	/**
	 * Retorna o conteúdo de "Cnpj" do arquivo xml
	 * 
	 * @author jonascc
	 * @param
	 * @return O conteúdo da tag Cnpj presente no arquivo xml
	 * @throws IOException
	 */
	private String extraiCnpj(Document document) throws IOException {
		NodeList nodeListCnpj = document.getElementsByTagName("Cnpj");
		if (nodeListCnpj != null && nodeListCnpj.getLength() > 0
				&& nodeListCnpj.item(0).getFirstChild() != null) {
			return nodeListCnpj.item(0).getFirstChild().getNodeValue();
		} else {
			throw new IOException("Campo \"Cnpj\" não encontrado no arquivo.");
		}
	}

	/**
	 * @author jonascc
	 * @param stringFormadora
	 * @return A cave de segurança que é inserida na tag ChaveSeguranca do
	 *         arquivo xml
	 * @throws Exception
	 */
	private String gerarHashBase64(String stringFormadora)
			throws LogTransmissaoArquivoException {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(
					stringFormadora.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
			for (int i = 0; i < encodedhash.length; i++) {
				String hex = Integer.toHexString(0xff & encodedhash[i]);
				if(hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			byte[] byteArray = hexString.toString().getBytes();
			
			Base64 base64 = new Base64();
			byte[] bytes = base64.encode(byteArray);
			return new String(bytes, "UTF-8");
		} catch(Exception e) {
			throw new LogTransmissaoArquivoException(
					"Erro ao gerar o hash da chave privada.", e);
		}
	}
	
	/**
	 * Faz o registro do log da transmissão do arquivo com códig da situação
	 * igual a 1 = UPLOAD.
	 * 
	 * @author jonascc
	 * @param
	 * @throws Exception
	 */
	public String registrarUpload() {
		try {
			registrarLogTransmissaoArquivo(1, null);
			logger.info(this.getClass(),
					"Situação Upload registrada com sucesso.");
			return null;
		} catch (Exception e) {
			logger.info(this.getClass(), "Mensagem: " + e.getMessage());
			logger.error(this.getClass(), e);
			return null;
		}
	}

	/**
	 * Faz o registro do log da transmissão do arquivo com códig da situação
	 * igual a 2 = TRANSMISSAO.
	 * 
	 * @author jonascc
	 * @param
	 * @throws Exception
	 */
	private void salvarTrasmissao() throws LogTransmissaoArquivoException {
		registrarLogTransmissaoArquivo(2, null);
		logger.info(this.getClass(),
				"Situação Transmissão registrada com sucesso.");
	}

	/**
	 * Faz o registro do log da transmissão do arquivo do tipo Lançamento (não
	 * há mensagem de retorno) com código da situação igual a 3 = RETORNO OK.
	 * 
	 * @author jonascc
	 * @param
	 * @throws Exception
	 */
	private void salvarResponseLancamento()
			throws LogTransmissaoArquivoException {
		registrarLogTransmissaoArquivo(3, null);
		logger.info(this.getClass(),
				"Situação Retorno OK registrada com sucesso.");
	}

	/**
	 * Faz o registro do log da transmissão do arquivo do tipo Plano de Contas
	 * com código da situação igual a 3 = RETORNO OK.
	 * 
	 * @author jonascc
	 * @param
	 * @throws IOException
	 */
	private void salvarResponsePlanoContas(Document responseXml)
			throws LogTransmissaoArquivoException {
		NodeList tagMensagem = responseXml.getElementsByTagName("Mensagem");
		if (tagMensagem != null && tagMensagem.getLength() > 0
				&& tagMensagem.item(0).getFirstChild() != null) {
			String mensagem = tagMensagem.item(0).getFirstChild()
					.getNodeValue();
			registrarLogTransmissaoArquivo(3, mensagem);
			logger.info(this.getClass(),
					"Situação Retorno OK registrada com sucesso.");
		} else {
			logger.info(this.getClass(),
					"O elemento \"Mensagem\" não foi encontrado.");
		}
	}

	/**
	 * Faz o registro do log da transmissão do arquivo do tipo Lançamento ou
	 * Plano de Contas com código da situação igual a 4 = INCONSISTENTE caso
	 * seja retornado algum erro (tag "ListaDeErros").
	 * 
	 * @author jonascc
	 * @param
	 * @throws Exception
	 */
	private boolean salvarResponseError(Document responseXml)
			throws LogTransmissaoArquivoException {
		NodeList nodeListError = responseXml
				.getElementsByTagName("ListaDeErros");
		if (nodeListError != null && nodeListError.getLength() > 0
				&& nodeListError.item(0).getFirstChild() != null) {
			String listaErros = nodeListError.item(0).getFirstChild()
					.getNodeValue();
			registrarLogTransmissaoArquivo(4, listaErros);
			logger.info(this.getClass(),
					"Situação Inconsistente registrada com sucesso.");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Faz o registro do log da transmissão do arquivo. Situações possíveis:<br>
	 * 1 = UPLOAD - Um arquivo foi escolhido pelo usuário <br>
	 * 2 = TRANSMISSAO - O arquivo foi transmitido ao Webservice <br>
	 * 3 = RETORNO OK - O Webservice retornou uma mensagem de sucesso<br>
	 * 4 = INCONSISTENTE - O Webservice retornou algum erro, como chave de
	 * segurança inválida
	 * 
	 * @author jonascc
	 * @param
	 * @throws Exception
	 */
	private void registrarLogTransmissaoArquivo(int situacaoTransmissao,
			String mensagemRetorno) {
		try {
			TransmissaoArquivoLogDTO dto = new TransmissaoArquivoLogDTO();
			dto.setCodSituacaoTransArquivo(situacaoTransmissao);
			dto.setCodMunicipio(Long.valueOf(municipioSelecionado));
			Integer nSeqUnOrg = retornarNumSequencial(dependenciaSelecionada);
			dto.setCodDependencia(nSeqUnOrg);
			dto.setCodTipoArquivo(Integer.valueOf(tipoArquivo));
			

			String[] parts = nomeArquivo.split("[\\\\/]");
			String nome = parts[parts.length - 1];

			if (nome.length() > 40) {
				nome = nome.substring(0, 40);
			}

			if (mensagemRetorno != null && mensagemRetorno.length() > 250) {
				mensagemRetorno = mensagemRetorno.substring(0, 250);
				mensagemRetorno = mensagemRetorno.replaceAll("\\$", "");
			}
			dto.setMensagemRetorno(mensagemRetorno);
			
			dto.setNomeArquivo(nome);
			Long codEmpresa = retornarCodEmpresa(dependenciaSelecionada);
			dto.setCodEmpresa(codEmpresa);

			logTransmissaoArquivoServiceImpl.incluirLogTransmissaoArquivo(dto);

		} catch (Exception e) {
			throw new LogTransmissaoArquivoException(
					"Erro ao registrar a situação da transmissão do arquivo.",
					e);
		}
	}

	/**
	 * Converte e retorna a resposta xml no formato String em um objeto Document
	 * 
	 * @author jonascc
	 * @param
	 * @throws IOException
	 *             , SAXException, ParserConfigurationException
	 */
	private Document parseResponse(String response) throws LogTransmissaoArquivoException {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			if(response.contains("<!DOCTYPE") || response.contains("System")) {
				logger.error(this.getClass(), new LogTransmissaoArquivoException("Erro ao processar a resposta do Webservice pois contem conteudo DOCTYPE."));
			}
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			InputStream stream = new ByteArrayInputStream(response.getBytes("UTF-8"));

			return builder.parse(stream);
		} catch (Exception e) {
			throw new LogTransmissaoArquivoException(
					"Erro ao processar a resposta do Webservice.", e);
		}
	}

	/**
	 * Retorna o código da empresa da dependência selecionada.
	 * 
	 * @author jonascc
	 * @param
	 */
	private Long retornarCodEmpresa(String codDependencia) {
		DependenciasMunicipioDTO dep = buscarDepedencia(dependenciaSelecionada);
		if (dep.getCodigoPessoaJuridica() != null
				&& !dep.getCodigoPessoaJuridica().equals("")) {
			return Long.valueOf(dep.getCodigoPessoaJuridica());
		} else {
			return null;
		}
	}

	/**
	 * Retorna o código da unidade organizacional da dependência selecionada.
	 * 
	 * @author jonascc
	 * @param
	 */
	private Integer retornarNumSequencial(String codDependencia) {
		DependenciasMunicipioDTO dep = buscarDepedencia(dependenciaSelecionada);
		if (dep.getNumeroSequencialDependencia() != null
				&& !dep.getNumeroSequencialDependencia().equals("")) {
			return Integer.valueOf(dep.getNumeroSequencialDependencia());
		} else {
			return null;
		}
	}

	/**
	 * Procura e retorna a dependência selecionada a partir de seu código ou um
	 * novo objeto caso nada seja encontrado.
	 * 
	 * @author jonascc
	 * @param
	 */
	private DependenciasMunicipioDTO buscarDepedencia(String codDependencia) {
		for (DependenciasMunicipioDTO dependencia : listaDependenciasMunicipio) {
			if (dependencia.getCodigoDependencia().equals(codDependencia)) {
				return dependencia;
			}
		}
		return new DependenciasMunicipioDTO();
	}

	/**
	 * Busca a chave privada da dependência. Essa chave é usada para gerar a
	 * chve de segurança que é inserida no arquivo xml
	 * 
	 * @author jonascc
	 * @param stringFormadora
	 * @return A chave privada que é usada para gerar a chave de segurança
	 */
	private String obterChavePrivada() {
		Long codEmpresa = retornarCodEmpresa(dependenciaSelecionada);
		Integer nSeqUnOrg = retornarNumSequencial(dependenciaSelecionada);
		ParametrizacaoDepDTO retorno = parametrizarDependenciaServiceImpl
				.consultarParametrizacao(Long.valueOf(municipioSelecionado),
						codEmpresa, nSeqUnOrg);

		if (retorno == null || retorno.getChaveSeguranca() == null) {
			throw new LogTransmissaoArquivoException(
					"A Chave de Segurança da dependência não foi encontrada.");
		}

		return retorno.getChaveSeguranca();
	}

	/**
	 * Busca a url do Webservice cadastrada no arquivo application.properties
	 * 
	 * @author jonascc
	 * @return A url do Webservice
	 */
	public String getUrlWebservice() throws IOException {

		logger.info(this.getClass(), "Lendo o arquivo application.properties.");
		Properties propertiesFil = new Properties();
		String urlWebservice = null;
		FileInputStream fis = null;
		
		try {
			String basePath = System.getProperty("brad.configaplpath");
			Path finalPath = Paths.get(basePath, "giss", "application.properties").normalize().toAbsolutePath();
	        
			if(!isValidResourceName(basePath) || !isValidResourceName(finalPath.toString())) {
				throw new IOException("Propriedade do sistema brad.configaplpath não localizada ou inválida.");
			}
			
			logger.info(this.getClass(), "application.properties path: " + finalPath);
			File file = finalPath.toFile();
			if (!file.exists() || !file.isFile()) {
	            throw new IOException("Arquivo de configuração não encontrado: " + finalPath);
	        }
			
			fis = new FileInputStream(file);
	        propertiesFil.load(fis);
	        
			urlWebservice = propertiesFil.getProperty("webservice.url");
			logger.info(this.getClass(), "Propriedade encontrada: " + urlWebservice);
			
			String alertManager = propertiesFil.getProperty("alertManager.fileEmitter.fileName");
			logger.info(this.getClass(), "Alert manager: " + alertManager);
			
		} catch(Exception e) {
			throw new LogTransmissaoArquivoException("Erro ao tentar obter a url do Webservice.", e);
		} finally {
	        if (fis != null) {
	            try {
	                fis.close();
	            } catch (IOException e) {
	            	logger.error(this.getClass(), e);
	            }
	        }
	    }
		
		return urlWebservice;
	}
	
    public boolean isValidResourceName(String resourceName) {
         String VALID_RESOURCE_NAME_REGEX = "^[a-zA-Z0-9_/\\\\.\\-:]+$";
         
        if (resourceName == null || resourceName.isEmpty()) {
            return false;
        }

        return resourceName.matches(VALID_RESOURCE_NAME_REGEX) && resourceName.contains("suportedbdc_config");
    }

	public IDependenciaService getDependenciaImpl() {
		return dependenciaImpl;
	}

	public void setDependenciaImpl(IDependenciaService dependenciaImpl) {
		this.dependenciaImpl = dependenciaImpl;
	}

	public List<EstadosComboBean> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<EstadosComboBean> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public List<SelectItem> getComboEstados() {
		return comboEstados;
	}

	public void setComboEstados(List<SelectItem> comboEstados) {
		this.comboEstados = comboEstados;
	}

	public String getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(String estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public List<SelectItem> getComboMunicipiosPorEstado() {
		return comboMunicipiosPorEstado;
	}

	public void setComboMunicipiosPorEstado(
			List<SelectItem> comboMunicipiosPorEstado) {
		this.comboMunicipiosPorEstado = comboMunicipiosPorEstado;
	}

	public List<MunicipioDTO> getListaMunicipiosPorEstado() {
		return listaMunicipiosPorEstado;
	}

	public void setListaMunicipiosPorEstado(
			List<MunicipioDTO> listaMunicipiosPorEstado) {
		this.listaMunicipiosPorEstado = listaMunicipiosPorEstado;
	}

	public String getMunicipioSelecionado() {
		return municipioSelecionado;
	}

	public void setMunicipioSelecionado(String municipioSelecionado) {
		this.municipioSelecionado = municipioSelecionado;
	}

	public List<DependenciasMunicipioDTO> getListaDependenciasMunicipio() {
		return listaDependenciasMunicipio;
	}

	public void setListaDependenciasMunicipio(
			List<DependenciasMunicipioDTO> listaDependenciasMunicipio) {
		this.listaDependenciasMunicipio = listaDependenciasMunicipio;
	}

	public List<SelectItem> getComboDependencias() {
		return comboDependencias;
	}

	public void setComboDependencias(List<SelectItem> comboDependencias) {
		this.comboDependencias = comboDependencias;
	}

	public DependenciasMunicipioDTO getDependenciaMunicipio() {
		return dependenciaMunicipio;
	}

	public void setDependenciaMunicipio(
			DependenciasMunicipioDTO dependenciaMunicipio) {
		this.dependenciaMunicipio = dependenciaMunicipio;
	}

	public String getDependenciaSelecionada() {
		return dependenciaSelecionada;
	}

	public void setDependenciaSelecionada(String dependenciaSelecionada) {
		this.dependenciaSelecionada = dependenciaSelecionada;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public ILogTransmissaoArquivoService getLogTransmissaoArquivoServiceImpl() {
		return logTransmissaoArquivoServiceImpl;
	}

	public void setLogTransmissaoArquivoServiceImpl(
			ILogTransmissaoArquivoService logTransmissaoArquivoServiceImpl) {
		this.logTransmissaoArquivoServiceImpl = logTransmissaoArquivoServiceImpl;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public IParametrizarDependenciaService getParametrizarDependenciaServiceImpl() {
		return parametrizarDependenciaServiceImpl;
	}

	public void setParametrizarDependenciaServiceImpl(
			IParametrizarDependenciaService parametrizarDependenciaServiceImpl) {
		this.parametrizarDependenciaServiceImpl = parametrizarDependenciaServiceImpl;
	}

	public boolean isNomeArquivoDesabilitado() {
		return nomeArquivoDesabilitado;
	}

	public void setNomeArquivoDesabilitado(boolean nomeArquivoDesabilitado) {
		this.nomeArquivoDesabilitado = nomeArquivoDesabilitado;
	}

}
