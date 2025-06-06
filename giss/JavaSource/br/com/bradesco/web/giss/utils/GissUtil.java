package br.com.bradesco.web.giss.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.faces.FactoryFinder;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.FacesContextFactory;
import javax.faces.event.PhaseId;
import javax.faces.event.ValueChangeEvent;
import javax.faces.lifecycle.Lifecycle;
import javax.faces.lifecycle.LifecycleFactory;
import javax.faces.model.SelectItem;
import javax.faces.validator.Validator;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.MaskFormatter;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.apache.myfaces.config.RuntimeConfig;
import org.apache.myfaces.config.element.NavigationCase;
import org.apache.myfaces.config.element.NavigationRule;
import org.apache.myfaces.util.HashMapUtils;
import org.apache.myfaces.util.MessageUtils;

import br.com.bradesco.web.aq.application.util.BradescoCommonServiceFactory;
import br.com.bradesco.web.aq.application.util.faces.BradescoFacesUtils;
import br.com.bradesco.web.aq.view.components.arq.UIClientSideValidation.validator.CommonsValidator;
import br.com.bradesco.web.aq.view.util.FacesUtils;
import br.com.bradesco.web.giss.service.business.mantermunicipio.IManterMunicipioServiceConstants;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * @nome: GissUtil.java
 * 
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public class GissUtil {

	/**
	 * Representa o formato de uma data sem as horas usando pontos
	 */
	public static final String FORMATO_DATA_SEM_HORA_PONTO = "dd.MM.yyyy";

	/**
	 * Representa o formato de uma data sem as horas usando barras
	 */
	public static final String FORMATO_DATA_SEM_HORA_BARRA = "dd/MM/yyyy";

	/**
	 * Representa o formato de uma data sem as horas usando barras
	 */
	public static final String FORMATO_DATA_SEM_HORA_TRACO = "yyyy-MM-dd";

	/**
	 * Representa o formato de uma data com as horas
	 */
	public static final String FORMATO_DATA_COM_HORA = "yyyy-MM-dd-HH.mm.ss";

	/**
	 * Representa o formato de uma data em TIMESTAMP
	 */
	public static final String FORMATO_TIMESTAMP = "yyyy-MM-dd-HH.mm.ss.SSSSSS";
	
	/**
     * Representa o valor 10 para calculo de potência.
     */
    public static final Double BASE_DEZ = 10d;

	/**
	 * Data e hora completa formatada.
	 */
	public static final String DATA_HORA_COMPLETA_FORMATADO_COM_MILISEG = "dd/MM/yyyy HH:mm:ss:SSSSSS";
	
	public static final String DATA_HORA_COMPLETA_FORMATADO = "dd/MM/yyyy HH:mm:ss";

	/**
	 * Representa o formato apenas de horas, sem a data
	 */
	public static final String FORMATO_HORA_SEM_DATA = "HH:mm:ss";

	/**
	 * Representa uma String vazia.
	 */
	public static final String STRING_EMPTY = "";

	public static final String DATA_MINIMA = "01.01.0001";

	public static final String DATA_MAXIMA = "31.12.2099";

	public static final int CODIGO_DESCRICAO = 1;

	public static final int DESCRICAO = 2;

	public static final int ZERO = 0;
	
	/**
     * Representa um String Zero.
     */
    public static final String STRING_ZERO = "0";

    /**
     * Representa um String Um.
     */
    public static final String STRING_UM = "1";

    /**
     * Representa um String Dois.
     */
    public static final String STRING_DOIS = "2";

    /**
     * Representa um String Tres.
     */
    public static final String STRING_TRES = "3";

    /**
     * Representa um String Quatro.
     */
    public static final String STRING_QUATRO = "4";

    /**
     * Representa um String Cinco.
     */
    public static final String STRING_CINCO = "5";

	public static final String FORMATO_DATA_SEM_HORA = "dd.MM.yyyy";
	
	/**
     * Representa a formatação de moeda.
     */
    public static final String DECIMAL_PATTERN = "#,##0.00";

    /**
     * Representa a formatação de moeda com 5 casas decimais.
     */
    public static final String DECIMAL_PATTERN_CINCO_CASAS = ",##0.00000";

    /**
     * Representa a formatação de moeda com 8 casas decimais.
     */
    public static final String DECIMAL_PATTERN_OITO_CASAS = ",##0.00000000";
    
    /**
     * Casas Decimais da moeda real.
     */
    private static final String CASAS_DECIMAIS_REAL = "2";
    
    /**
     * Representa o valor 10 para calculo de potência.
     */
    public static final String STRING_BASE_DEZ = "10";

	static String defaultInputNumberDecimalSeparator = ",";
	static String defaultInputNumberGroupSeparator = ".";
	static boolean defaultInputNumberSelectAllText = true;

	private static Locale locale = new Locale("pt", "BR");

	/**
	 * 
	 * Construtor privado da classe SiteUtil.
	 * 
	 */
	public GissUtil() {
	}

	public static String formatarCampoDeValorMonetario(Double valorini) {

		String valor = formatNumber(valorini, 2, ",", true);
		return valor;
	}

	public static String formatNumber(double value, int decimals, String decimalSeparator, boolean showGroups) {

		String valueCopy = new DecimalFormat("0.00").format(value);
		valueCopy = replaceAll(valueCopy, ".", decimalSeparator);
		return formatNumber(valueCopy, decimals, decimalSeparator, showGroups);
	}

	public static String formatNumber(String value, int decimals, String decimalSeparator, boolean showGroups) {

		String ret = new String(value);
		String integerNumbers;
		String decimalNumbers;
		int position = 0;

		if (Long.parseLong(replaceAll(replaceAll(ret, ".", ""), ",", "")) == 0) {
			if (decimals == 0) {
				return "0";
			} else {
				return "0" + decimalSeparator + preencherZerosADireita("", decimals);
			}
		}

		ret = replaceAll(ret, ".", "");
		if (decimals == 0) {
			return ret;
		}

		if (ret.indexOf(decimalSeparator) == -1) {
			integerNumbers = ret.substring(0, ret.length());
			decimalNumbers = preencherZerosADireita("", decimals);
		} else {
			integerNumbers = ret.substring(0, ret.indexOf(decimalSeparator));
			decimalNumbers = preencherZerosADireita(ret.substring(ret.indexOf(decimalSeparator) + 1, ret.length()), decimals).substring(0, decimals);
		}
		ret = integerNumbers + decimalSeparator + decimalNumbers;

		if (ret.indexOf(decimalSeparator) == -1) {
			integerNumbers = ret.substring(0, ret.length());
			decimalNumbers = preencherZerosADireita("", decimals);
		} else {
			integerNumbers = ret.substring(0, ret.indexOf(decimalSeparator));
			if (integerNumbers == "")
				integerNumbers = "0";

			decimalNumbers = preencherZerosADireita(ret.substring(ret.indexOf(decimalSeparator) + 1, ret.length()), decimals);
		}

		int count = 0;
		for (position = integerNumbers.length(); position > 0; position--) {
			if (count == 3) {
				integerNumbers = integerNumbers.substring(0, position) + defaultInputNumberGroupSeparator + integerNumbers.substring(position, integerNumbers.length());
				count = 1;
				position--;
			}
			count += 1;
		}
		return integerNumbers + decimalSeparator + decimalNumbers;
	}

	/**
	 * completa um valor com zeros a esquerda até completar o tamanho máximo
	 */
	public static String preencherZerosADireita(String valor, int tamanhoMaximo) {
		String retorno = valor;
		for (int i = retorno.length(); i < tamanhoMaximo; i++) {
			retorno += "0";
		}
		return retorno;
	}

	/**
	 * completa um valor com zeros a direita até completar o tamanho máximo
	 */
	public static String preencherZerosAEsquerda(String valor, int tamanhoMaximo) {
		String retorno = valor;
		for (int i = retorno.length(); i < tamanhoMaximo; i++) {
			retorno = "0" + retorno;
		}
		return retorno;
	}
	
	public static String preencherZerosEsquerda(String valor, int tamanhoMaximo) {
		String retorno = valor;
		for (int i = retorno.length(); i < tamanhoMaximo; i++) {
			retorno = "0" + retorno;
		}
		return retorno;
	}
	
	public static String formatarCampoQuantidade(String cnpj) {

		String cnpjformatado = "";
		String bloco = "   ";

		while (cnpj.length() < 9) {
			cnpj = bloco + cnpj;
		}

		String bloco3 = cnpj.substring(cnpj.length() - 9, cnpj.length() - 6);
		String bloco2 = cnpj.substring(cnpj.length() - 6, cnpj.length() - 3);
		String bloco1 = cnpj.substring(cnpj.length() - 3, cnpj.length());

		if (!bloco3.equals(bloco))
			cnpjformatado += bloco3 + ".";
		if (!bloco2.equals(bloco))
			cnpjformatado += bloco2 + ".";
		if (!bloco1.equals(bloco))
			cnpjformatado += bloco1;

		return cnpjformatado.trim();
	}

	private static String formatarCnpjECpf(String cnpj) {

		String cnpjformatado = "";
		String bloco = "   ";

		while (cnpj.length() < 9) {
			cnpj = bloco + cnpj;
		}

		String bloco3 = cnpj.substring(cnpj.length() - 9, cnpj.length() - 6);
		String bloco2 = cnpj.substring(cnpj.length() - 6, cnpj.length() - 3);
		String bloco1 = cnpj.substring(cnpj.length() - 3, cnpj.length());

		if (!bloco3.equals(bloco))
			cnpjformatado += bloco3 + ".";
		if (!bloco2.equals(bloco))
			cnpjformatado += bloco2 + ".";
		if (!bloco1.equals(bloco))
			cnpjformatado += bloco1;

		return cnpjformatado.trim();
	}

	private static String complementaDigito(String campo, int num) {
		while (campo.length() < num) {
			campo = "0" + campo;
		}

		return campo;
	}
	
	public static String complementaEspacos(String campo, int num) {
		while (campo.length() < num) {
			campo = campo + " ";
		}

		return campo;
	}
	
	public static String complementaEspacosEsquerda(String campo, int num) {
		while (campo.length() < num) {
			campo = " " + campo;
		}

		return campo;
	}

	public static String formatarCNPJComMascara(String cnpj, String filial, String controle) {

		String cnpjFormatada = formatarCnpjECpf(cnpj);

		String filialFormatada = complementaDigito(filial, 4);

		String controleFormatada = complementaDigito(controle, 2);

		return cnpjFormatada + "/" + filialFormatada + "-" + controleFormatada;
	}

	public static String formatarCPFComMascara(String cnpj, String controle) {

		String cnpjFormatada = formatarCnpjECpf(cnpj);

		String controleFormatada = complementaDigito(controle, 2);

		return cnpjFormatada + "-" + controleFormatada;
	}

	public static String aplicaMascara(String cnpj, String filial, String controle) {
		String cnpjFinal = addZero(cnpj, 9) + addZero(filial, 4) + addZero(controle, 2);
		return formatar(cnpjFinal);
	}

	private static String formatar(String cnpj) {
		StringBuffer cnpjFormatado = new StringBuffer(cnpj);
		cnpjFormatado.insert(3, '.').insert(7, '.').insert(11, '/').insert(16, '-');
		return cnpjFormatado.toString();
	}

	public static String formatarCPF(String cpf) {
		StringBuffer cpfFormatado = new StringBuffer(addZero(cpf, 9));
		cpfFormatado.insert(3, '.').insert(7, '.');
		return cpfFormatado.toString();
	}

	public static String getDigitoCPF(String cpf) {
		StringBuffer cpfFormatado = new StringBuffer(addZero(cpf, 9));
		cpfFormatado.insert(3, '.').insert(7, '.');

		int soma1 = 0;
		int soma2 = 0;
		int resto = 0;

		String digito1 = "";
		String digito2 = "";

		if (cpf.length() == 9) {
			soma1 = (Integer.parseInt(cpf.substring(0, 1)) * 10) + (Integer.parseInt(cpf.substring(1, 2)) * 9) + (Integer.parseInt(cpf.substring(2, 3)) * 8) + (Integer.parseInt(cpf.substring(3, 4)) * 7) + (Integer.parseInt(cpf.substring(4, 5)) * 6) + (Integer.parseInt(cpf.substring(5, 6)) * 5) + (Integer.parseInt(cpf.substring(6, 7)) * 4) + (Integer.parseInt(cpf.substring(7, 8)) * 3) + (Integer.parseInt(cpf.substring(8, 9)) * 2);

			resto = soma1 % 11;
			digito1 = "" + (resto < 2 ? 0 : 11 - resto);

			soma2 = (Integer.parseInt(cpf.substring(0, 1)) * 11) + (Integer.parseInt(cpf.substring(1, 2)) * 10) + (Integer.parseInt(cpf.substring(2, 3)) * 9) + (Integer.parseInt(cpf.substring(3, 4)) * 8) + (Integer.parseInt(cpf.substring(4, 5)) * 7) + (Integer.parseInt(cpf.substring(5, 6)) * 6) + (Integer.parseInt(cpf.substring(6, 7)) * 5) + (Integer.parseInt(cpf.substring(7, 8)) * 4) + (Integer.parseInt(cpf.substring(8, 9)) * 3) + (Integer.parseInt(digito1) * 2);

			resto = soma2 % 11;
			digito2 = "" + (resto < 2 ? 0 : 11 - resto);
		}
		;

		return (digito1 + digito2);
	}

	private static String addZero(String vr, int size) {
		String resultado = "";
		int vrLength = vr.length();
		if (vrLength <= size) {
			int dif = size - vrLength;
			for (int i = 0; i < dif; i++)
				resultado += "0";
			return resultado += vr;
		}
		throw new IllegalArgumentException("Valor maior que o intervalo informado.");
	}

	/**
	 * @nome: converteStringDouble
	 * @propósito: Método responsável por converteStringDouble.
	 *
	 * @param valor String
	 * @return Double
	 */
	public static Double converteStringDouble(String valor) {
		if ("".equals(valor)) {
			return new Double(0);
		} else {
			String sempontos = valor.replace(".", "");
			return new Double(sempontos.replace(",", "."));
		}
	}

	public String converteTimeStampString(String sdata) {
		String resultado = "";
		if(!notNull(sdata).equals(""))
			resultado = sdata.substring(8, 10) + "/" + sdata.substring(5, 7) + "/" + sdata.substring(0, 4);
		return resultado;
		
		
	}
	
	/**
	 * @nome: converteTimeStampCompleto
	 * @propósito: Método responsável por converteTimeStampCompleto.
	 *
	 * @param data String
	 * @return String
	 */
	public static String converteTimeStampCompleto(String data) {
		String resultado = "";
		if(!notNull(data).equals("")) {
			resultado = data.substring(8, 10) + "/" + data.substring(5, 7) + 
			"/" + data.substring(0, 4) + " " + data.substring(11, 13) + 
			":" + data.substring(14, 16) + ":" + data.substring(17, 19) + 
			":" + data.substring(20);
		}
		return resultado;
	}
	
	public static String mascararCosifSAP(String sconta) {
		if(sconta == null){
	        sconta = "";
	    } else if("".equals(sconta)){
			sconta = "0";
		}
	    
	    sconta = sconta.trim();
	    		
		if(sconta.contains(".")){
		    return sconta;
		}
		
        try {
    		MaskFormatter mascara = null;
    		
            long contaLong = Long.parseLong(sconta);
            sconta = String.valueOf(contaLong);
        	sconta = preencherZerosAEsquerda(sconta, 10);
			mascara = new MaskFormatter("#.#.#.##.##.###");
			mascara.setValueContainsLiteralCharacters(false);
			sconta = mascara.valueToString(sconta);
		} catch (ParseException e) {
			e.getMessage();
			return sconta;
		}
        
        return sconta;
	}

	public static String mascaraContaContabil(String sconta, String razao) {
	    if(sconta == null){
	        sconta = "";
	    }
	    
	    sconta = sconta.trim();
	    
		if("".equals(sconta)){
			sconta = "0";
		}
		int grupo = pegarCodigoGrupo(razao);
		int subgrupo = pegarCodigoSubgrupo(razao);
		MaskFormatter mascara = null;
		if(grupo == 0 || subgrupo == 0){
			if(sconta.contains(".")){
			    return sconta;
			}
	        try {
	            long contaLong = Long.parseLong(sconta);
	            sconta = String.valueOf(contaLong);
	        	sconta = preencherZerosAEsquerda(sconta, 10);
	        	mascara = new MaskFormatter("#.#.#.##.##.##-#");
				mascara.setValueContainsLiteralCharacters(false);
				sconta = mascara.valueToString(sconta);
			} catch (ParseException e) {
				e.printStackTrace();
				return sconta;
			}
			
		} else {
			if(sconta.contains(".")){
				return sconta;
			} else {
				try {
				    long contaLong = Long.parseLong(sconta);
	                sconta = String.valueOf(contaLong);
					sconta = preencherZerosAEsquerda(sconta, 10);
					mascara = new MaskFormatter("#.#.#.##.##.##-#");
					mascara.setValueContainsLiteralCharacters(false);
					sconta = mascara.valueToString(sconta);
				} catch (ParseException e) {
					e.printStackTrace();
					return sconta;
				}
				return sconta;
			}
			
		}
		
		return sconta;
	}

	public static String mascaraRazaoContabil(String sconta) {
		if(sconta.length() > 6 || sconta.length() < 6){
			return "";
		}
		
		String razao = "";
        MaskFormatter mascara = null;
        try {
			mascara = new MaskFormatter("###-###");
			mascara.setValueContainsLiteralCharacters(false);
			razao = mascara.valueToString(sconta);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        return razao;
	}
	
	public static String mascaraItemLei(String itemLei) {
		if(itemLei.length() > 8 || itemLei.length() < 8){
			return "";
		}
		String itemLeiFormatado = "";
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("##.##.##.##");
			mascara.setValueContainsLiteralCharacters(false);
			itemLeiFormatado = mascara.valueToString(itemLei);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return itemLeiFormatado;
	}
	
    public static String mascaraCosif(String cosif) {
        if(cosif == null || "".equals(cosif) || cosif.length() < 8) {
            return "";
        }

        String cosifFormatado = "";
        MaskFormatter mascara = null;
        try {
            if(cosif.length() == 8) {
                mascara = new MaskFormatter("#.#.#.##.##-#");
            } else if( cosif.length() == 10 ) {
                mascara = new MaskFormatter("#.#.#.##.##.##-#");
            } else if (cosif.length() == 12) {
                mascara = new MaskFormatter("#.##.##.##.##.##-#");
            } else {
            	return cosif;
            }

            mascara.setValueContainsLiteralCharacters(false);
            cosifFormatado = mascara.valueToString(cosif);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cosifFormatado;
    }

	public static String mascaraCep(String scep) {

		int tamanho = scep.length();
		int tam = 0;
		String traco = "-";
		String zeros = "";
		String resultado = "";

		if (tamanho < 8) {
			tam = 8 - tamanho;

			for (int i = 0; i < tam; i++) {
				zeros += "0";
			}

			tamanho = 8;
			scep = zeros + scep;
		}

		resultado += scep.substring(tamanho - 8, tamanho - 6);
		resultado += scep.substring(tamanho - 6, tamanho - 3) + traco;
		resultado += scep.substring(tamanho - 3, tamanho);

		return resultado;
	}

	public String converteInteiroData(String sdata) {

		sdata = "0" + sdata;
		int tamanho = sdata.length();
		String seperador = "/";
		String resultado = "";

		resultado += sdata.substring(tamanho - 8, tamanho - 6) + seperador;
		resultado += sdata.substring(tamanho - 6, tamanho - 4) + seperador;
		resultado += sdata.substring(tamanho - 4, tamanho);

		return resultado;
	}

	public static String procuraUnidadeFederativa(List<SelectItem> listaDeEstados, String filtroEstado) {

		String sCodEstado = "";
		String sRetorno = "";
		int tam = listaDeEstados.size() - 1;

		for (int i = 0; i <= tam; i++) {
			sCodEstado = listaDeEstados.get(i).getValue().toString();
			if (sCodEstado.equals(filtroEstado)) {
				sRetorno = sCodEstado + " - " + listaDeEstados.get(i).getLabel();
				break;
			}
		}

		return sRetorno;
	}

	public static String procuraCodigoUnidadeFederativa(List<SelectItem> listaDeEstados, String descricaoEstado) {
		int tam = listaDeEstados.size() - 1;

		for (int i = 0; i <= tam; i++) {
			SelectItem item = listaDeEstados.get(i);
			if (item.getLabel().equals(descricaoEstado)) {
				return item.getValue().toString();
			}
		}

		return "0";
	}

	public static String procuraCodigoUnidadeFederativaPorSigla(List<EstadosComboBean> listaEstados, String siglaEstado) {

		int tam = listaEstados.size() - 1;

		for (int i = 0; i <= tam; i++) {
			String sigla = listaEstados.get(i).getSigla();
			if (sigla.equals(siglaEstado)) {
				return listaEstados.get(i).getCodigo();
			}
		}

		return "0";
	}

	public static List<SelectItem> carregaComboEstados(List<EstadosComboBean> listaEstados) {

		List<SelectItem> comboEstadosList = new ArrayList<SelectItem>();

		int tam = listaEstados.size();
		for (int i = 0; i < tam; i++) {
			EstadosComboBean estadosCombo = new EstadosComboBean();
			estadosCombo.setCodigo(listaEstados.get(i).getCodigo());
			estadosCombo.setSigla(listaEstados.get(i).getSigla());
			estadosCombo.setNome(listaEstados.get(i).getNome());
			comboEstadosList.add(new SelectItem(estadosCombo.getCodigo(), estadosCombo.getNome()));
		}

		return comboEstadosList;
	}

	public static String procuraUnidadeFederativaSemCodigo(List<SelectItem> listaDeEstados, String filtroEstado) {

		String sCodEstado = "";
		String sRetorno = "";
		int tam = listaDeEstados.size() - 1;

		for (int i = 0; i <= tam; i++) {
			sCodEstado = listaDeEstados.get(i).getValue().toString();
			if (sCodEstado.equals(filtroEstado)) {
				sRetorno = listaDeEstados.get(i).getLabel();
				break;
			}
		}

		return sRetorno;
	}

	public static String procuraTipoServico(List<SelectItem> listaDeTipoServico, String filtroTipoServico) {

		String sCodTipoServico = "";
		String sRetorno = "";
		int tam = listaDeTipoServico.size() - 1;

		for (int i = 0; i <= tam; i++) {
			sCodTipoServico = listaDeTipoServico.get(i).getValue().toString();
			if (sCodTipoServico.equals(filtroTipoServico)) {
				sRetorno = listaDeTipoServico.get(i).getLabel();
				break;
			}
		}

		return sRetorno;
	}

	public String comboTipoIncidenciaDePara(int codigoTipoIncidencia) {

		String descTipoIncidencia = "";

		switch (codigoTipoIncidencia) {
		case 1:
			descTipoIncidencia = IManterMunicipioServiceConstants.TIPO_INCIDENCIA_PRORROGA_1;
			break;
		case 2:
			descTipoIncidencia = IManterMunicipioServiceConstants.TIPO_INCIDENCIA_PRORROGA_2;
			break;
		case 3:
			descTipoIncidencia = IManterMunicipioServiceConstants.TIPO_INCIDENCIA_PRORROGA_3;
			break;
		case 4:
			descTipoIncidencia = IManterMunicipioServiceConstants.TIPO_INCIDENCIA_PRORROGA_4;
			break;
		case 5:
			descTipoIncidencia = IManterMunicipioServiceConstants.TIPO_INCIDENCIA_PRORROGA_NORMAL;
			break;
		}

		return descTipoIncidencia;
	}

	public static Date formataData(String data) throws Exception {
		if (data == null || data.equals(""))
			return null;

		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			date = (java.util.Date) formatter.parse(data);
		} catch (ParseException e) {
			throw e;
		}
		return date;
	}

	public static String geraDataCompetencia() {

		String zero = "";
		Date dataAtual = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		String dataSaida = dateFormat.format(dataAtual);

		int mesCompetencia = Integer.valueOf(dataSaida.substring(2, 4));
		int anoCompetencia = Integer.valueOf(dataSaida.substring(4, 8));

		mesCompetencia--;

		if (mesCompetencia == 0) {
			mesCompetencia = 12;
			anoCompetencia--;
		}

		if (mesCompetencia < 10)
			zero = "0";

		String dataCompetencia = zero + String.valueOf(mesCompetencia) + "/" + String.valueOf(anoCompetencia);

		return dataCompetencia;
	}

	public static String getDataCompetenciaCorrente() {
		return DateUtils.format(new Date(), "MM/yyyy");
	}

	public static String formataDataTimeStamp(String dataTimeStamp) {

		if (dataTimeStamp == null || "".equals(dataTimeStamp.trim())) {
			return "";
		}

		String anoSaida = dataTimeStamp.substring(0, 4);
		String mesSaida = dataTimeStamp.substring(5, 7);
		String diaSaida = dataTimeStamp.substring(8, 10);

		return diaSaida + "/" + mesSaida + "/" + anoSaida;
	}
	
	public static String formataHoraTimeStamp(String dataTimeStamp){
		if (dataTimeStamp == null || "".equals(dataTimeStamp.trim())) {
			return "";
		}

		String hora = dataTimeStamp.substring(11, 19).replace(".", ":");

		return hora;
	}

	public static String formatarCep(Integer cep, Integer complementoCep) {
		if (cep == null || complementoCep == null) {
			return null;
		}

		StringBuilder cepFormatado = new StringBuilder();
		cepFormatado.append(NumberUtils.format(cep, "00000"));
		cepFormatado.append("-");
		cepFormatado.append(NumberUtils.format(complementoCep, "000"));
		return cepFormatado.toString();
	}

	/**
	 * Obter o contexto Faces mediante o ServletRequest. (por exemplo, para obter o faces context do Servlet Filter)
	 * 
	 * @param request
	 *            ServletRequest.
	 * @param respose
	 *            ServletResponse.
	 * @param servletContext
	 *            ServletContext.
	 * 
	 * @return FacesContext instancia do contexto Faces atual.
	 */
	public static FacesContext getFacesContext(ServletRequest request, ServletResponse respose, ServletContext servletContext) {

		FacesContext facesContext = FacesContext.getCurrentInstance();

		if (facesContext != null) {
			return facesContext;
		}

		FacesContextFactory contextFactory = (FacesContextFactory) FactoryFinder.getFactory(FactoryFinder.FACES_CONTEXT_FACTORY);
		LifecycleFactory lifecycleFactory = (LifecycleFactory) FactoryFinder.getFactory(FactoryFinder.LIFECYCLE_FACTORY);
		Lifecycle lifecycle = lifecycleFactory.getLifecycle(LifecycleFactory.DEFAULT_LIFECYCLE);

		return contextFactory.getFacesContext(servletContext, request, respose, lifecycle);
	}

	/**
	 * Obter o atributo 'toViewId', configurado no caso da navegação, para os "outcome" e "fromAction" passados.
	 * 
	 * @param facesContext
	 *            Contexto Faces.
	 * @param outcome
	 *            O atributo 'outcome' do caso da navegação.
	 * @param fromAction
	 *            O atributo 'from-action' do caso da navegação.
	 * @return String O atributo 'toViewId' do caso da navegação.
	 */
	@SuppressWarnings("unchecked")
	public static String getNavigationCaseToViewId(FacesContext facesContext, String outcome, String fromAction) {

		if (facesContext == null) {
			return null;
		}

		String viewId = "*";

		if (facesContext.getViewRoot() != null) {
			viewId = facesContext.getViewRoot().getViewId();
		}

		Map casesMap = getNavigationCases(facesContext);
		NavigationCase navigationCase = null;

		List casesList = (List) casesMap.get(viewId);
		if (casesList != null) {
			// Exact match?
			navigationCase = calculaMapeamentoNavigationCase(casesList, fromAction, outcome);
		}

		if (navigationCase != null) {
			return navigationCase.getToViewId();
		}

		return null;
	}

	/**
	 * Retorna o mapeamento do caso da navegação para os parametros passados.
	 * 
	 * @param casesList
	 *            Listagem dos casos da navegação.
	 * @param actionRef
	 *            Referencia da ação realizada.
	 * @param outcome
	 *            O String 'outcome' para mapeamento.
	 * @return NavigationCase O caso da navegação mapeado
	 */
	@SuppressWarnings("unchecked")
	public static NavigationCase calculaMapeamentoNavigationCase(List casesList, String actionRef, String outcome) {
		for (int i = 0, size = casesList.size(); i < size; i++) {
			NavigationCase caze = (NavigationCase) casesList.get(i);
			String cazeOutcome = caze.getFromOutcome();
			String cazeActionRef = caze.getFromAction();
			if ((cazeOutcome == null || cazeOutcome.equals(outcome)) && (cazeActionRef == null || cazeActionRef.equals(actionRef))) {
				return caze;
			}
		}
		return null;
	}

	/**
	 * Retorna um Map com todos os casos da navegação configurados.
	 * 
	 * @param facesContext
	 *            O contexto Faces.
	 * @return Map com os casos da navegação.
	 */
	@SuppressWarnings("unchecked")
	public static Map getNavigationCases(FacesContext facesContext) {

		ExternalContext externalContext = facesContext.getExternalContext();
		RuntimeConfig runtimeConfig = RuntimeConfig.getCurrentInstance(externalContext);

		Collection rules = runtimeConfig.getNavigationRules();
		int rulesSize = rules.size();
		Map cases = new HashMap(HashMapUtils.calcCapacity(rulesSize));

		for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
			NavigationRule rule = (NavigationRule) iterator.next();
			String fromViewId = rule.getFromViewId();

			if (fromViewId == null) {
				fromViewId = "*";
			} else {
				fromViewId = fromViewId.trim();
			}

			List list = (List) cases.get(fromViewId);
			if (list == null) {
				list = new ArrayList(rule.getNavigationCases());
				cases.put(fromViewId, list);
			} else {
				list.addAll(rule.getNavigationCases());
			}

		}
		return cases;
	}

	/**
	 * 
	 * Obtem o valor do atributo messageKey.
	 * 
	 * @param messageKey
	 *            - Chave da mensagem
	 * @return Mensagem definida pelo atributo messageKey.
	 */
	public static String getFacesMessage(String messageKey) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = MessageUtils.getMessage(facesContext, messageKey);
		return facesMessage.getSummary();
	}

	/**
	 * 
	 * Obtem o valor do atributo messageKey, com o valor das variaveis.
	 * 
	 * @param messageKey
	 *            - Chave da mensagem
	 * @param params
	 *            - Array de parametros
	 * @return Mensagem definida pelo atributo messageKey, com as variaveis preenchidas.
	 */
	public static String getFacesMessage(String messageKey, Object[] params) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = MessageUtils.getMessage(facesContext, messageKey, params);
		return facesMessage.getSummary();
	}

	/**
	 * Insere um novo mensagem de erro GLOBAL no FacesMessages. O mensagem é obtenido pela sua chave.
	 * 
	 * @param messageKey
	 *            - Chave da mensagem
	 */
	public static void addMessageErrorMessage(String messageKey) {
		addMessageErrorMessage(null, messageKey);
	}

	/**
	 * Insere um novo mensagem de erro no FacesMessages. O mensagem é obtenido pela sua chave, e associado no compenente correspondente.
	 * 
	 * @param clientId
	 *            - id do componente
	 * @param messageKey
	 *            - Chave da mensagem
	 */
	public static void addMessageErrorMessage(String clientId, String messageKey) {
		String msg = getFacesMessage(messageKey);
		FacesUtils.addErrorMessage(clientId, msg);
	}

	/**
	 * Insere um novo mensagem de erro GLOBAL no FacesMessages. O mensagem é obtenido pela sua chave, com o valor das variaveis.
	 * 
	 * @param messageKey
	 *            - Chave da mensagem
	 * @param params
	 *            - Array de parametros
	 */
	public static void addMessageErrorMessage(String messageKey, Object[] params) {
		addMessageErrorMessage(null, messageKey, params);
	}

	/**
	 * Insere um novo mensagem de erro no FacesMessages. O mensagem é obtenido pela sua chave, com o valor das variaveis, e associado no compenente correspondente.
	 * 
	 * @param clientId
	 *            - id do componente
	 * @param messageKey
	 *            - Chave da mensagem
	 * @param params
	 *            - Array de parametros
	 */
	public static void addMessageErrorMessage(String clientId, String messageKey, Object[] params) {
		String msg = getFacesMessage(messageKey, params);
		FacesUtils.addErrorMessage(clientId, msg);
	}

	/**
	 * <p>
	 * Recupera o objeto HttpServletRequest.
	 * </p>
	 * 
	 * @return HttpServletRequest
	 */
	public static HttpServletRequest getServletRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}

	/**
	 * Formatar uma string com o número 0 a esquerda de acordo com o tamanho.
	 * 
	 * @param value
	 *            - Valor a ser formatado.
	 * @param size
	 *            - Tamanho do campo.
	 * @return Retorna uma string com zeros à esquerda.
	 */
	public static String formatNumber(String value, int size) {
		String ret = null;
		if (value == null) {
			value = "";
		}
		if (value.length() > size) {
			ret = value.substring(0, size);
		} else {
			ret = value;
			if (value.length() < size) {
				for (int i = value.length(); i < size; i++) {
					ret = "0" + ret;
				}
			}
		}
		return ret;
	}

	/**
	 * Formatar uma string com o caracter " " a direita de acordo com o tamanho.
	 * 
	 * @param value
	 *            - Valor a ser formatado.
	 * @param size
	 *            - Tamanho do campo.
	 * @return Retorna uma string foramtada.
	 */
	public static String formatString(String value, int size) {
		String ret = null;
		if (value == null) {
			value = "";
		}
		if (value.length() > size) {
			ret = value.substring(0, size);
		} else {
			ret = value;
			if (value.length() < size) {
				for (int i = value.length(); i < size; i++) {
					ret += " ";
				}
			}
		}
		return ret;
	}

	/**
	 * Formata um bloco de texto autenticado para exibição.
	 * 
	 * @param autenticada
	 *            Valor da String de autenticação.
	 * @return Retorna um objeto da classe <tt>String</tt> com os dados de autenticação prontos para exibição.
	 */
	public static String formatarTextoAutenticado2(String autenticada) {
		StringBuffer ret = new StringBuffer();
		ret.append(autenticada.charAt(0));
		for (int i = 1; i < (autenticada.length() - 1); i++) {
			ret.append(autenticada.charAt(i));
		}
		ret.append(autenticada.charAt(autenticada.length() - 1));
		return ret.toString();
	}

	/**
	 * 
	 * Cria um objeto Date a partir de uma String e um padrão. Exemplo de pattern: ddMMyyyy.
	 * 
	 * @param date
	 *            Data a ser criada.
	 * @param pattern
	 *            padrão.
	 * @return Data criada
	 * @throws ParseException
	 *             Caso ocorra algum erro.
	 */
	public static Date stringToDate(String date, String pattern) throws ParseException {
		if (date == null || "".equals(date))
			return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.parse(date);
	}

	/**
	 * 
	 * Transforma uma data (Date) em String. Exemplo de pattern: ddMMyyyy.
	 * 
	 * @param date
	 *            Data.
	 * @param pattern
	 *            padrão desejado.
	 * @return Data formato String.
	 */
	public static String dateToStringCatalogo(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

	/**
	 * 
	 * Transforma uma data (Date) em String. Exemplo de pattern: ddMMyyyy.
	 * 
	 * @param date
	 *            Data.
	 * @param pattern
	 *            padrão desejado.
	 * @return Data formato String.
	 */
	public static String dateToString(Date date, String pattern) {
		if (date == null)
			return "";
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

	/**
	 * Reseteamos el managed bean
	 * 
	 * @param mBean
	 *            Nome do managed bean.
	 */
	public static void liberaManagedBean(String mBean) {
		try {
			FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + mBean + "}").setValue(FacesContext.getCurrentInstance(), null);
		} catch (Exception e) {
			BradescoCommonServiceFactory.getLogManager().warn(GissUtil.class, "No ha sido posible liberamos el managed Bean[" + mBean + "]");
		}

	}

	/**
	 * Objetivo: Verificar se a String é nula ou vazia.
	 * 
	 * @param pSString
	 *            String a ser comparada.
	 * @return <i>true</i>, se a String for nula ou vazia; <i>false</i>, caso contrário.
	 */
	public static boolean isEmptyOrNull(String pSString) {

		return (pSString == null || pSString.trim().equals(STRING_EMPTY));
	}

	/**
	 * Objetivo: Verificar se o numero é nulo ou vazio (zero).
	 * 
	 * @param pSString
	 *            String a ser comparada.
	 * @return <i>true</i>, se a String for nula ou vazia; <i>false</i>, caso contrário.
	 */
	public static boolean isEmptyOrNull(Number n) {
		return n == null || n.doubleValue() == 0;
	}

	/**
	 * 
	 * Método que retorna uma Data ou Hora em um formato específico, definido pelo cliente, a partir de uma variável de entrada Data e/ou Hora.
	 * 
	 * @param pDateString
	 *            Data ou Hora a ter o formato modificado
	 * @param pPadraoOrigem
	 *            Formato inicial da Data ou Hora. Ex: yyyy/MM/dd-HH:mm:ss
	 * @param pPadraoDestino
	 *            Formato da Data ou Hora a ser retornada
	 * @return String com o formato de data ou hora
	 * @throws ParseException
	 *             caso ocorra um erro na formatação
	 */
	public static String changeStringDateFormat(String pDateString, String pPadraoOrigem, String pPadraoDestino) throws ParseException {

		if (GissUtil.isEmptyOrNull(pDateString)) {
			return pDateString;
		}

		return GissUtil.dateToString(GissUtil.stringToDate(pDateString, pPadraoOrigem), pPadraoDestino);
	}

	/**
	 * Remove todos validadores do tipo required do componente <code>input</code>.
	 * 
	 * @see CommonsValidator.
	 * 
	 * @param input
	 *            Componente de entrada de dados pelo usuario.
	 */
	public static void removerValidators(UIInput input) {
		if (input != null) {

			CommonsValidator common = findValidator("required", input);
			if (common != null) {
				input.setRequired(false);
				input.removeValidator(common);
			}
		}
	}

	public static CommonsValidator findValidator(String tipo, UIInput campo) {
		boolean encontrou = false;
		CommonsValidator commons = null;

		if (tipo != null && campo != null) {

			Validator[] array = campo.getValidators();
			for (int i = 0; i < array.length; i++) {
				if (array[i] instanceof CommonsValidator) {
					commons = (CommonsValidator) array[i];
					if (commons.getType().equalsIgnoreCase(tipo)) {
						encontrou = true;
						break;
					}
				}
			}
		}

		if (encontrou)
			return commons;
		else
			return null;
	}

	/**
	 * Percorre uma lista de Itens Combo comparando o <code>value</code> com com <code>getValue</code> dos objetos {@link SelectItem} da lista.
	 * 
	 * @param T
	 *            extends {@link SelectItem}
	 * @param lista
	 * @param value
	 *            Valor do {@link SelectItem} a ser encontrado
	 * @return Item da lista encontrado. Caso não encontre será retornado <code>null</code>.
	 */
	public static <T extends SelectItem> T pesquisarItemSelecionadoCombo(List<T> lista, Object value) {
		if (value == null)
			return null;

		Iterator<T> ite = lista.iterator();
		while (ite.hasNext()) {
			T type = ite.next();
			if (type.getValue().equals(value))
				return type;
		}
		return null;
	}

	public static Integer selecionarRegistroCombo(List<?> lista, Object value) {
		if (value == null)
			return null;

		for (int i = 0; i < lista.size() - 1; i++) {
			SelectItem type = (SelectItem) lista.get(i);
			if (type.getValue().equals(value))
				return i;
		}

		return null;
	}

	public static Integer selecionarRegistroComboNovo(List<?> lista, Object value) {
		if (value == null)
			return null;

		for (int i = 0; i < lista.size(); i++) {
			SelectItem type = (SelectItem) lista.get(i);
			if (type.getLabel().equals(value))
				return Integer.valueOf(type.getValue().toString());
		}

		return 0;
	}

	/**
	 * Se o valor for nulo, retorna "", caso contrário o próprio valor
	 * 
	 * @param valor
	 * @return
	 */
	public static String removerPDoDigitoConta(String valor) {
		return notNull(valor).equalsIgnoreCase("p")? "0" : valor;
	}

	
	/**
	 * Se o valor for nulo, retorna "", caso contrário o próprio valor
	 * 
	 * @param valor
	 * @return
	 */
	public static String notNull(String valor) {
		return valor == null ? "" : valor;
	}
	


	/**
	 * Se o valor for nulo, retorna 0, caso contrário o int equivalente ao Integer
	 * 
	 * @param valor
	 * @return
	 */
	public static int notNull(Integer valor) {
		return valor == null ? 0 : valor.intValue();
	}
	
	/**
	 * Se o valor for nulo, retorna 0, caso contrário o int equivalente ao Integer
	 * 
	 * @param valor
	 * @return
	 */
	public static BigDecimal notNull(BigDecimal valor) {
		return valor == null ? new BigDecimal(0) : valor;
	}

	/**
	 * Se o valor for nulo, retorna 0, caso contrário long referente ao Long
	 * 
	 * @param valor
	 * @return
	 */
	public static long notNull(Long valor) {
		return valor == null ? 0 : valor.longValue();
	}

	/**
	 * Se o numero for zero, retorna null
	 * 
	 * @param valor
	 * @return
	 */
	public static Integer zeroNull(int valor) {
		return valor == 0 ? null : valor;
	}

	/**
	 * Se o numero for zero, retorna null
	 * 
	 * @param valor
	 * @return
	 */
	public static Long zeroNull(long valor) {
		return valor == 0 ? null : valor;
	}

	/**
	 * Se a string for "0" ou "0,00", retorna ""
	 * 
	 * @param valor
	 * @return
	 */
	public static String zeroNull(String valor) {
		return "0".equals(valor) || "0,00".equals(valor) ? "" : valor;
	}

	public static Integer stringToInteger(String valor) {
		return valor == null || "".equals(valor) ? 0 : Integer.valueOf(valor);
	}

	public static Long stringToLong(String valor) {
		return valor == null || "".equals(valor) ? 0 : Long.valueOf(valor);
	}

	/**
	 * Converte um List de combo para um map, para recuperar as descrições a partir das chaves
	 * 
	 * @param lista
	 * @param numerico
	 * @return
	 */
	public static Map<Object, String> toMap(List<? extends SelectItem> lista, boolean numerico) {
		Map<Object, String> mapa = new LinkedHashMap<Object, String>();
		Iterator<? extends SelectItem> it = lista.iterator();
		while (it.hasNext()) {
			SelectItem item = it.next();
			Object valor = item.getValue();
			if (numerico)
				valor = Integer.parseInt("0" + valor.toString());
			mapa.put(valor, item.getLabel());
		}
		return mapa;
	}

	/**
	 * Trata o Event para ser tratado apos o update_model, para evitar que os dados alterados no Listener sejam resetados com os valores da tela. Obs: Um booleano é retornado, deve-se sair da execução se o retorno for verdadeiro, exemplo: <code>
	 *   if(SiteUtil.mudaFaseEvento(event))return;
	 * </code>
	 * 
	 * @param event
	 * @return indice se deve sair da execução
	 */
	public static boolean mudaFaseEvento(ValueChangeEvent event) {
		if (event.getPhaseId().equals(PhaseId.UPDATE_MODEL_VALUES))
			return false;
		event.setPhaseId(PhaseId.UPDATE_MODEL_VALUES);
		event.queue();
		return true;
	}
	
	/**
	 * Nome: paraString
	 * 
	 * Para string.
	 * 
	 * @param objeto
	 *            the objeto
	 * @return string
	 * @see
	 */
	public static String paraString(Object objeto) {
		if (isEmptyOrNull(objeto)) {
			return STRING_EMPTY;
		}

		return String.valueOf(objeto);
	}
	
	/**
	 * Nome: isEmptyOrNull
	 * 
	 * Verifica se é empty or null.
	 * 
	 * @param pSString
	 *            the p s string
	 * @return true, se for empty or null
	 * @see
	 */
	public static boolean isEmptyOrNull(Object pSString) {
		if (pSString instanceof List<?>) {
			List<?> plist = (List<?>) pSString;
			return (plist == null || plist.isEmpty());
		} else {
			return (pSString == null || STRING_EMPTY.equals(String.valueOf(pSString)));
		}
	}

	/**
	 * Adequa a String ao formato long.
	 * 
	 * @param param
	 *            - Parametro a ser tratado.
	 * 
	 * @return Parametro com valor adequado.
	 */
	public static long tratarParametroLong(String param) {

		try {
			if (GissUtil.isEmptyOrNull(param)) {
				return NumberUtils.ZERO_L;
			} else {
				return Long.parseLong(param);
			}
		} catch (Exception e) {
			return NumberUtils.ZERO_L;
		}
	}

	/**
	 * Verifica se a String está nula.
	 * 
	 * @param param
	 *            - Parametro a ser tratado.
	 * 
	 * @return Parametro com valor adequado.
	 */
	public static String tratarParametroString(String param) {

		try {
			if (GissUtil.isEmptyOrNull(param)) {
				return STRING_EMPTY;
			} else {
				return param;
			}
		} catch (Exception e) {
			return STRING_EMPTY;
		}
	}

	/**
	 * Adequa a String ao formato int.
	 * 
	 * @param param
	 *            - Parametro a ser tratado.
	 * 
	 * @return Parametro com valor adequado.
	 */
	public static int tratarParametroInt(String param) {

		try {
			if (GissUtil.isEmptyOrNull(param)) {
				return NumberUtils.ZERO;
			} else {
				return Integer.parseInt(param);
			}
		} catch (Exception e) {
			return NumberUtils.ZERO;
		}
	}

	/**
	 * Pesquisar a descrição do combo. {@link javax.faces.model.SelectItem}
	 * 
	 * @param value
	 *            : valor a ser pesquisado ma lista do combo
	 * @param tipo
	 *            : Indica se a lista retornada sera com o codigo ou sem o codigo.
	 * 
	 * @see SiteUtil.TIPO_COMBO_DESCRICAO
	 * @see SiteUtil.TIPO_COMBO_CODIGO_DESCRIC
	 * @return Descrição do grupo de garantia selecionado no combo. Null se nao encontrar
	 */
	@SuppressWarnings("unchecked")
	public static String pesquisarDescricaoItemCombo(int tipo, String value, List listaElementos) throws ClassCastException {
		if (GissUtil.isEmptyOrNull(value)) {
			return "";
		}
		String retorno = null;
		if (value != null && listaElementos != null && !listaElementos.isEmpty()) {
			Iterator it = listaElementos.iterator();
			while (it.hasNext()) {
				SelectItem item = (SelectItem) it.next();
				if (item.getValue().equals(value)) {
					if (tipo == DESCRICAO) {
						retorno = getDescricaoSemCodigo(item.getValue().toString(), item.getLabel().toString());
					} else {
						retorno = item.getLabel().toString();
					}
					break;
				}
			}
		}

		return retorno;
	}

	private static String getDescricaoSemCodigo(String value, String label) {
		String retorno = null;
		if (value != null && label != null && label.startsWith(value + " - ")) {
			int ind1 = label.indexOf(value + " - ");
			retorno = label.substring(ind1 + value.length() + 3);
		}
		return retorno;
	}

	/**
	 * Objetivo: Verificar se o Object é não nulo.
	 * 
	 * @param object
	 *            Object a ser verificado.
	 * @return <i>true</i>, se o Object for não nulo; <i>false</i>, caso contrário.
	 */
	public static boolean isNotNull(Object object) {
		return object != null;
	}

	/**
	 * Objetivo: Método que copia os valores das propriedades do Objeto pObjetoOrigem, através dos métodos públicos get, para as propriedades do Objeto pObjetoAlvo, através dos métodos públicos set.
	 * 
	 * ESTE MÉTODO ESPERA O MESMO TIPO DE OBJETO PARA REALIZAR A CÓPIA.
	 * 
	 * @param pObjetoOrigem
	 *            Objeto de Origem - aqui serão buscadas as propriedades não nulas
	 * @param pObjetoAlvo
	 *            Objeto de Destino - aqui serão setadas as respectivas propriedades.
	 */
	public static void copiarPropriedadesNaoNulas(final Object pObjetoOrigem, final Object pObjetoAlvo) {
		Method[] lMethods = pObjetoOrigem.getClass().getMethods();
		for (int lIndice = 0; lIndice < lMethods.length; lIndice++) {
			boolean lBIsValidMethod = !lMethods[lIndice].getName().equals("getClass");
			if (lMethods[lIndice].getName().startsWith("get") && lBIsValidMethod) {
				Method lMethodGet = lMethods[lIndice];
				try {
					Method lMethodSet = pObjetoAlvo.getClass().getMethod("s" + lMethodGet.getName().substring(1), new Class[] { lMethodGet.getReturnType() });
					if (lMethodGet.invoke(pObjetoOrigem, new Object[0]) != null) {
						lMethodSet.invoke(pObjetoAlvo, new Object[] { lMethodGet.invoke(pObjetoOrigem, new Object[0]) });
					}
				} catch (RuntimeException e) {
					throw e;
				} catch (NoSuchMethodException e) {
					continue;
				} catch (IllegalAccessException e) {
					continue;
				} catch (InvocationTargetException e) {
					continue;
				}
			}
		}
	}

	/**
	 * TransformaSimNao
	 * 
	 * @param opcao
	 * @return opcao formatada
	 */
	public static String transformaSimNao(String opcao) {
		if (isEmptyOrNull(opcao))
			return "";
		return "S".equals(opcao) ? GissUtil.getFacesMessage("label_sim") : GissUtil.getFacesMessage("label_nao");
	}

	/**
	 * Objetivo: Verificar se a String é não vazia.
	 * 
	 * @param pSString
	 *            String a ser verificada.
	 * @return <i>true</i>, se a String for não vazia; <i>false</i>, caso contrário.
	 */
	public static boolean isNotEmpty(String pSString) {
		return !isEmptyOrNull(pSString);
	}

	/**
	 * Transforma
	 * 
	 * @param data
	 *            {@link Date}
	 * @return data formatada
	 */
	public static String formataDataMainframe(String dataMainframe) {
		if (GissUtil.isEmptyOrNull(dataMainframe)) {
			return "";
		}
		return dataMainframe.replace(".", "/");
	}

	/**
	 * Método que retorna a data atual
	 * 
	 * @return Retorna a data atual
	 */
	public static String getDataAtual() {
		return dateToString(new Date(), "dd/MM/yyyy");
	}

	/**
	 * Substring sem StringIndexOutOfBoundsException. se o parametro fim < 0, segue é capturado do inicio solicitado até o fim da string.
	 * 
	 * @param string
	 * @param inicio
	 * @param fim
	 * @return
	 */
	public static String substring(String string, int inicio, int fim) {
		int l = string.length();
		if (inicio > l)
			return "";
		if (fim > l || fim < 0)
			fim = l;
		return string.substring(inicio, fim);
	}

	/**
	 * Cria uma lista de SelectItems, utilizando um CriadorSelectItem personalizado para o VO Util para criação de combos
	 * 
	 * @param <T>
	 * @param lista
	 * @param criador
	 * @return
	 */
	public static <T> List<SelectItem> criarSelectItemList(List<T> lista, CriadorSelectItem<T> criador) {
		List<SelectItem> saida = new ArrayList<SelectItem>();
		Iterator<T> i = lista.iterator();
		while (i.hasNext()) {
			saida.add(criador.converte(i.next()));
		}
		return saida;
	}

	/**
	 * Cria uma lista de SelectItems com valores numéricos sequenciais Util para criação de radios/checks de listas
	 * 
	 * @param <T>
	 * @param quantidade
	 * @return
	 */
	public static <T> List<SelectItem> criarSelectItemList(int quantidade, int inicial) {
		List<SelectItem> saida = new ArrayList<SelectItem>();
		for (int i = 0; i < quantidade; i++) {
			saida.add(new SelectItem(i + inicial, ""));
		}
		return saida;
	}

	public static String buscarStatusVeiculo(Integer status) {
		if (status == 1) {
			return "Veículo com Arrendamento Mercantil";
		} else if (status == 2) {
			return "Veículo com Reserva de Domínio";
		} else if (status == 3) {
			return "Veículo com Alienação Fiduciária";
		} else if (status == 4) {
			return "Veículo teve GRAVAME baixado pelo agente financeiro";
		} else if (status == 5) {
			return "Veículo teve GRAVAME baixado pelo DETRAN";
		} else if (status == 6) {
			return "Veículo nunca constou na base do sistema SNG";
		} else if (status == 7) {
			return "Veículo teve GRAVAME cancelado pelo agente financeiro";
		} else if (status == 8) {
			return "Veículo teve GRAVAME cancelado pelo DETRAN";
		} else if (status == 9) {
			return "Veículo com Arrendamento Mercantil com documento já emitido";
		} else if (status == 10) {
			return "Veículo com Reserva de Domínio com documento já emitido";
		} else if (status == 11) {
			return "Veículo com Alienação Fiduciária com documento já emitido";
		} else if (status == 12) {
			return "Veículo com Transferência de Propriedade";
		} else if (status == 13) {
			return "Veículo com Transferência de Propriedade Cancelada";
		} else if (status == 14) {
			return "Erro de comunicação";
		} else if (status == 15) {
			return "Chassi não localizado";
		} else if (status == 16) {
			return "Veículo com ROUBO / FURTO";
		} else if (status == 17) {
			return "Veículo com restrição";
		} else if (status == 18) {
			return "Dados do veículo divergentes";
		} else if (status == 19) {
			return "Erro de execução";
		}
		return "";
	}

	public static String buscarSituacao(Integer situacao) {
		if (situacao == 0) {
			return "Solicitado";
		} else if (situacao == 1) {
			return "Liberado";
		} else if (situacao == 2) {
			return "Transferido";
		} else if (situacao == 3) {
			return "Não transferido";
		}
		return "";
	}

	public static String concatenaDataHora(Date dataRecebida, String horaRecebida) {
		String data = GissUtil.dateToString(dataRecebida, GissUtil.FORMATO_DATA_SEM_HORA_TRACO);
		String hora = horaRecebida.replaceAll(":", ".");
		String dataHora = data + "-" + hora + ".000001";

		return dataHora;
	}

	public static Date retiraData(String data) throws Exception {
		return GissUtil.stringToDate(data.substring(0, 10), GissUtil.FORMATO_DATA_SEM_HORA_TRACO);
	}

	public static String retiraHora(String data) {
		data = data.substring(11, 19);
		data = data.replaceAll("\\.", ":");
		return data;
	}
	
	public static String concatenaComHifenEspacado(String objetoI, String objetoII) {
		String retorno = STRING_EMPTY;
		
		if(!objetoI.equalsIgnoreCase(STRING_EMPTY)){
			if(!objetoII.equalsIgnoreCase(STRING_EMPTY)){
				retorno = objetoI + " - " + objetoII;
			}
		}

		return retorno;
	}

	/**
	 * Formata o cep
	 * 
	 * @param cep
	 * @param complemento
	 * @return
	 */
	public static String formataCEP(int cep, int complemento) {
		return new Formatter().format("%05d-%03d", cep, complemento).toString();
	}

	/**
	 * Retorna um int[] sendo: [0] - cep [1] - complemento
	 * 
	 * @param cep
	 * @return
	 */
	public static int[] lerCEP(String cep) {
		int[] ret = { 0, 0 };
		if (cep == null)
			return ret;
		String[] s = cep.split("-");
		try {
			ret[0] = Integer.parseInt(s[0]);
			ret[1] = Integer.parseInt(s[1]);
		} catch (Exception e) {
		} // Nao trata, pode ser
		return ret;
	}

	/**
	 * @nome: formatarValoresBig
	 * @propósito: Método responsável por formatarValoresBig.
	 *
	 * @param value BigDecimal
	 * @return String
	 */
	public static String formatarValoresBig(BigDecimal value) {
		String num = value.toString();

		String decimais = "";
		String inteiros = num;
		String negativo = "";
		String novoNum = "";

		int qtd = 0;

		if (num.indexOf(".") != -1 || num.indexOf(",") != -1) {
			decimais = "," + num.substring((num.indexOf(".") != -1 ? num.indexOf(".") : num.indexOf(",")) + 1, num.length());
			inteiros = num.substring(0, num.indexOf(".") != -1 ? num.indexOf(".") : num.indexOf(","));
			if (inteiros.contains("-")) {
				negativo = inteiros.substring(0, 1);
				inteiros = inteiros.substring(1, inteiros.length());
			}
		}

		for (int i = inteiros.length(); i >= 1; i--) {

			if (qtd == 3) {
				novoNum = "." + novoNum;
				qtd = 0;
			}
			novoNum = inteiros.substring(i - 1, i) + novoNum;
			qtd++;

		}
		if (decimais.equals("")) {
			decimais = ",00";
		} else if (decimais.length() < 3) {
			decimais = decimais + "0";
		}
		if (novoNum.equals("")) {
			novoNum = "0";
		}
		return negativo + novoNum + decimais;
	}

	public static List<SelectItem> preencherSelectItemsMunicipio(List<?> array) {
		List<SelectItem> list = new ArrayList<SelectItem>();
		if (array != null) {
			for (int i = 0; i <= array.size(); i++) {
				list.add(new SelectItem(i, " "));
			}
			return list;
		}
		return list;
	}

	public static boolean validaPeriodoMes(int mesInicial, int anoInicial, int mesFinal, int anoFinal, int intervalo) {
		Calendar dataInicial = Calendar.getInstance(locale);
		dataInicial.set(Calendar.MONTH, mesInicial);
		dataInicial.set(Calendar.YEAR, anoInicial);
		
		Calendar dataFinal = Calendar.getInstance(locale);
		dataFinal.set(Calendar.MONTH, mesFinal);
		dataFinal.set(Calendar.YEAR, anoFinal);
		
		int difMes = dataFinal.get(Calendar.MONTH) - dataInicial.get(Calendar.MONTH);
		int difAno = ((dataFinal.get(Calendar.YEAR) - dataInicial.get(Calendar.YEAR)) * 12);

		int total = difAno + difMes;
		
		if(total < intervalo){
			return true;
		}
		return false;
	}
	
	public static boolean validarPeriodoMaiorCorrente(Integer mesFinal, Integer anoFinal) {
		Calendar dataCorrente = Calendar.getInstance(locale);
		int mesCorrente = dataCorrente.get(Calendar.MONTH) + 1;
		int anoCorrente = dataCorrente.get(Calendar.YEAR);

		return ((anoFinal > anoCorrente) || (anoFinal == anoCorrente && mesFinal > mesCorrente));
	}
	
	public static boolean validarPeriodoCorrente(Integer mesFinal, Integer anoFinal) {
		Calendar dataCorrente = Calendar.getInstance(locale);
		int mesCorrente = dataCorrente.get(Calendar.MONTH);
		int anoCorrente = dataCorrente.get(Calendar.YEAR);

		return ((anoFinal > anoCorrente) || (anoFinal == anoCorrente && mesFinal > mesCorrente));
	}
	
	public static Boolean verificarPeriodoDozeMeses(Date dtInicial, Date dtFinal){
		
		String dataDe[] = new SimpleDateFormat("dd/MM/yyyy").format(dtInicial).split("/"); 
		String dataAte[] = new SimpleDateFormat("dd/MM/yyyy").format(dtFinal).split("/"); 

		Calendar dataInicial = Calendar.getInstance();
		dataInicial.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataDe[0]));
		dataInicial.set(Calendar.MONTH, Integer.parseInt(dataDe[1])-1);
		dataInicial.set(Calendar.YEAR, Integer.parseInt(dataDe[2]));
		
		Calendar dataFinal = Calendar.getInstance();
		dataFinal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataAte[0]));
		dataFinal.set(Calendar.MONTH, Integer.parseInt(dataAte[1])-1);
		dataFinal.set(Calendar.YEAR, Integer.parseInt(dataAte[2]));
		
		Calendar dataComparacao = Calendar.getInstance();
		dataComparacao.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataDe[0]));
		dataComparacao.set(Calendar.MONTH, Integer.parseInt(dataDe[1]) - 1);     
		dataComparacao.set(Calendar.YEAR, Integer.parseInt(dataDe[2]) + 1);   
		
		return dataFinal.after(dataComparacao);
		
	}
	
	public static Boolean verificarPeriodoDozeMesesSemDia(Date dtInicial, Date dtFinal){
		
		String dataDe[] = new SimpleDateFormat("MM/yyyy").format(dtInicial).split("/"); 
		String dataAte[] = new SimpleDateFormat("MM/yyyy").format(dtFinal).split("/"); 

		Calendar dataInicial = Calendar.getInstance();
		dataInicial.set(Calendar.MONTH, Integer.parseInt(dataDe[0])-1);
		dataInicial.set(Calendar.YEAR, Integer.parseInt(dataDe[1]));
		
		Calendar dataFinal = Calendar.getInstance();
		dataFinal.set(Calendar.MONTH, Integer.parseInt(dataAte[0])-1);
		dataFinal.set(Calendar.YEAR, Integer.parseInt(dataAte[1]));
		
		Calendar dataComparacao = Calendar.getInstance();
		dataComparacao.set(Calendar.MONTH, Integer.parseInt(dataDe[0]) - 1);     
		dataComparacao.set(Calendar.YEAR, Integer.parseInt(dataDe[1]) + 1);   
		
		return !(dataFinal.after(dataComparacao) || dataFinal.equals(dataComparacao));
		
	}
	
	public static Integer validarRazao(String razao){
	        
	    if(razao == null || "".equals(razao)){
            return 0;
	    } else if(razao.matches("\\b[0-9]{3}-[0-9]{3}\\b")){
	        return 1;
	    } else {
	        return -1;
	    }
	}
	public static Integer validar(String desc){
        
	    if(desc == null || "".equals(desc)){
            return 0;
	    } else if(desc.matches("\\b[0-9]{3}-[0-9]{3}\\b")){
	        return 1;
	    } else {
	        return -1;
	    }
	}
	
	public static Integer pegarCodigoGrupo(String razao){
	    
	    if(razao == null || "".equals(razao)){
            return 0;
	    } else if(razao.matches("\\b[0-9]{1,3}-[0-9]{1,3}\\b")){
	        return Integer.parseInt(razao.split("-")[0]);
	    } else {
	        return -1;
	    }
	    	
	}

   public static Integer pegarCodigoSubgrupo(String razao){

       if(razao == null || "".equals(razao)){
           return 0;
       } else if(razao.matches("\\b[0-9]{1,3}-[0-9]{1,3}\\b")){
           return Integer.parseInt(razao.split("-")[1]);
       } else {
           return -1;
       }
        
    }
	
   public static void gerarPDF(String nomeJasper,String nomePDF, List<?> lstDados,Map map) throws JRException, IOException, Exception{
	   
		FacesContext context = FacesContext.getCurrentInstance();
		ServletContext servletContext = (ServletContext) context.getExternalContext().getContext();

		String reportConsultaApuracaoMensal = servletContext.getRealPath("/reports/" + nomeJasper + ".jasper");
		String subReport = servletContext.getRealPath("/reports/") + "//";
		String enderecoImagem = servletContext.getRealPath("/images/logo_marca.png");
		String enderecoFundo = servletContext.getRealPath("/images/fundoBrad2.gif");

		JRBeanCollectionDataSource jrds = new JRBeanCollectionDataSource(lstDados);

		JasperPrint impressao = new JasperPrint();

		Map ht = new HashMap();
		ht.put("REPORT_LOCALE", new Locale("pt", "BR"));
		ht.put("SUBREPORT_DIR", subReport);
		ht.put("ENDERECO_IMAGEM", enderecoImagem);

		if(map != null){
			for(Object chave : map.keySet()){
				ht.put(chave, map.get(chave));
			}
		}
		
		impressao = JasperFillManager.fillReport(reportConsultaApuracaoMensal,ht, jrds);

		byte[] bytes = JasperExportManager.exportReportToPdf(impressao);

		FacesContext facesContext = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

		ServletOutputStream ouputStream = response.getOutputStream();
		response.addHeader("Content-disposition","attachment;filename=" + nomePDF + ".pdf");
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);

		// Esse popula o arquivo que será aberto ou salvo
		ouputStream.write(bytes, 0, bytes.length);
		ouputStream.flush();
		ouputStream.close();
		response.flushBuffer();
		context.responseComplete();
	   
   }
   
   public static String formatarDataInvertida(Integer data){
	   if (data == null){
		   data = 0;
	   }
	   
	   String dataString = String.valueOf(data);
	   dataString = preencherZerosAEsquerda(dataString, 6);
	   return dataString.substring(4) + "/" + dataString.substring(0,4);
	   
   }
   
   public static String formatarData(Integer data){
	   if (data == null){
		   data = 0;
	   }
	   
	   String dataString = String.valueOf(data);
	   dataString = preencherZerosAEsquerda(dataString, 6);
	   return dataString.substring(0,2) + "/" + dataString.substring(2);
	   
   }
   
	public static boolean isEmptyOrNullZero(String pSString) {
		return (pSString == null || pSString.trim().equals(STRING_EMPTY) || "0".equals(pSString));
	}
	
	public static String formatarRazaoContabil(int grupo, int subGrupo){
	    String grupoString = String.valueOf(grupo);
	    String subGrupoString = String.valueOf(subGrupo);
	    
	    if(grupoString.length() < 3){
	        grupoString = preencherZerosAEsquerda(grupoString, 3);
	    }
	    
	    if(subGrupoString.length() < 3){
            subGrupoString = preencherZerosAEsquerda(subGrupoString, 3);
        }
	    
	    return grupoString + "-" + subGrupoString;
	}
	
	public static String formatarRazaoContabilMesTotal(int grupo, int subGrupo){
		String grupoString = String.valueOf(grupo);
		String subGrupoString = String.valueOf(subGrupo);
		
		if(grupoString.length() < 3){
			grupoString = preencherZerosAEsquerda(grupoString, 2);
		}
		
		if(subGrupoString.length() < 3){
			subGrupoString = preencherZerosAEsquerda(subGrupoString, 2);
		}
		
		return grupoString + "-" + subGrupoString;
	}
   
    public static void retirarMensagemDuplicada(FacesContext context) {
        Iterator<FacesMessage> mensagem = FacesContext.getCurrentInstance().getMessages();
        int x = 0;
        while(mensagem.hasNext()){
            x++;
            mensagem.next();
            if(x > 1){
                mensagem.remove();
            }    
        }
    }
    
    /**
	 * @autor Evaristo.Rodrigues
	 * 
	 *        Atualiza o selectItems preenchido com ou sem a descrição e o
	 *        codigo dos objeto da lista que foi passada como parametro.
	 */
	public static void atualizarSelectItem(final List<?> lista, List<SelectItem> selectItems) {
		selectItems = new ArrayList<SelectItem>();
		for (int i = 0; i < lista.size(); i++) {
			selectItems.add(new SelectItem(i, " "));
		}
	}
	
	/**
	 * Nome: verificaStringNula.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String verificaStringNula(String str) {
		if (str == null) {
			return "";
		} else {
			return str;
		}
	}

	/**
	 * Nome: verificaStringNulaInteger.
	 *
	 * @param str the str
	 * @return the integer
	 */
	public static Integer verificaStringNulaInteger(String str) {
		if (str == null || "".equals(str)) {
			return 0;
		} else {
			return Integer.valueOf(str);
		}
	}
	
	/**
	 * Nome: verificaIntegerNulo.
	 *
	 * @param nro the nro
	 * @return the integer
	 */
	public static Integer verificaIntegerNulo(Integer nro) {
		if (nro == null) {
			return 0;
		} else {
			return nro.intValue();
		}
	}
	

	/**
	 * Verifica long nulo.
	 *
	 * @param nro the nro
	 * @return the long
	 */
	public static Long verificaLongNulo(Long nro) {
		if (nro == null) {
			return 0l;
		} else {
			return nro.longValue();
		}

	}
	
	public static String replaceAll(String sourceText, String find, String replacement) {
		String value = sourceText;
		while (value.indexOf(find) != -1) {
			value = value.replace(find, replacement);
		}
		return value;

	}
	
	public static Long verificaStringNulaLong(String str) {
		if (str == null || "".equals(str)) {
			return new Long(0);
		} else {
			return Long.valueOf(str);
		}
	} 
	
	/**
	 * @param <T>
	 * @param t
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getService(Class<T> t) {
		return (T) FacesUtils.getManagedBean(t.getSimpleName().substring(1));
	}
	
	/**
	 * @param class1
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> t) {
		return (T) FacesUtils.getManagedBean(t.getSimpleName());
	}
	
	/**
	 * Nome: extrairMesDataInteiro.
	 *
	 * @param data the data
	 * @return the integer
	 */
	public static Integer extrairMesDataInteiro(Date data) {

		Calendar date = Calendar.getInstance();

		if (data != null) {
			date.setTime(data);
			return date.get(Calendar.MONTH) + 1;
		} else {

			return 0;

		}

	}

	/**
	 * Nome: extrairAnoDataInteiro.
	 *
	 * @param data the data
	 * @return the integer
	 */
	public static Integer extrairAnoDataInteiro(Date data) {

		Calendar date = Calendar.getInstance();

		if (data != null) {
			date.setTime(data);
			return date.get(Calendar.YEAR);
		} else {

			return 0;

		}

	}
	
	public static String formatarValoresParaMoedaComMascara(String valor,
            String casasDecimais) {
        if (casasDecimais == null || casasDecimais.equals(STRING_EMPTY)) {
            casasDecimais = CASAS_DECIMAIS_REAL;
        }

        if (valor == null || valor.equals(STRING_EMPTY)) {
            valor = STRING_ZERO;
        }

        String valorComCasasDecimais = adcionaCasasDecimaisMoeda(valor,
                casasDecimais);

        if (casasDecimais.equals(CASAS_DECIMAIS_REAL)) {
            valorComCasasDecimais = formataStringParaMoedaComMascara(valorComCasasDecimais);
        } else {
            if (casasDecimais.equals(STRING_CINCO)) {
                valorComCasasDecimais = formataStringParaMoedaComMascara5CasasDecimais(valorComCasasDecimais);
            } else {
                valorComCasasDecimais = formataStringParaMoedaComMascara8CasasDecimais(valorComCasasDecimais);
            }
        }
        return valorComCasasDecimais;
    }
	
	public static String adcionaCasasDecimaisMoeda(String valor,
            String casasDecimais) {

        BigDecimal moeda = new BigDecimal(valor);
        BigDecimal bigDecimal_base_dez = new BigDecimal(BASE_DEZ);

        moeda = moeda.divide(bigDecimal_base_dez.pow(Integer.parseInt(casasDecimais)));

        return String.valueOf(moeda);
    }
	
	 public static String formataStringParaMoedaComMascara(String valor) {
        if (valor != null) {

            BigDecimal valorBD = new BigDecimal(valor);
            DecimalFormat format = (DecimalFormat) NumberFormat.getNumberInstance(locale);
            format.applyPattern(DECIMAL_PATTERN);
            String valorRetorno = format.format(valorBD);

            return valorRetorno;
        }
        return null;
    }
	 
	 public static String formataStringParaMoedaComMascara5CasasDecimais(String valor) {
	        if (valor != null) {
	            BigDecimal valorBD = new BigDecimal(valor);

	            DecimalFormat format = (DecimalFormat) NumberFormat.getNumberInstance(locale);
	            format.applyPattern(DECIMAL_PATTERN_CINCO_CASAS);
	            String valorRetorno = format.format(valorBD);

	            return valorRetorno;
	        }
	        return null;
	    }

	    /**
	     * Metodo que recebe um valor String troca o ponto por vírgula para
	     * apresentação na tela
	     * @param valor String Metodo que recebe um valor String troca o ponto por
	     *            vírgula para apresentação na tela
	     * @param valor String
	     * @exception NullPointerException
	     * @return string formatada
	     */
	    public static String formataStringParaMoedaComMascara8CasasDecimais(String valor) {
	        if (valor != null) {
	            BigDecimal valorBD = new BigDecimal(valor);

	            DecimalFormat format = (DecimalFormat) NumberFormat.getNumberInstance(locale);
	            format.applyPattern(DECIMAL_PATTERN_OITO_CASAS);
	            String valorRetorno = format.format(valorBD);

	            return valorRetorno;
	        }
	        return null;
	    }
	
    /**
	 * @nome: getCepMask
	 * @propósito: Método responsável por getCepMask.
	 *
	 * @param cep String
	 * @return Integer
	 */
	public static Integer getCepMask(String cep) {
		Integer num = 0;
		cep = removeNaoNumericos(cep);
		if (!isEmptyOrNull(cep) && cep.trim().length() == 8) {
			num = stringToInteger(cep.trim().substring(0,5));
		}
		return num;
	}
	
	/**
	 * @nome: getCepComplMask
	 * @propósito: Método responsável por getCepComplMask.
	 *
	 * @param cep String
	 * @return Integer
	 */
	public static Integer getCepComplMask(String cep) {
		Integer compl = 0;
		cep = removeNaoNumericos(cep);
		if (!isEmptyOrNull(cep) && cep.trim().length() == 8) {
			compl = stringToInteger(cep.trim().substring(5));
		}
		return compl;
	}
	
	/**
    * Introduzir aqui os comentarios necessarios para o método.
    * 
    * @param valor
    * @return .
    */
   public static String removeNaoNumericos(final String valor) {
       if (valor == null) {
           return STRING_EMPTY;
       }
       return valor.replaceAll("[^0-9]", STRING_EMPTY);
   }
   
   /**
    * Introduzir aqui os comentarios necessarios para o método.
    * 
    * @param valor - String
    * @return - Retorna o valor passado como Integer para String.
    */
   public static String getString(final Integer valor) {
       String retorno = STRING_EMPTY;
       if (valor != null) {
           try {
               retorno = String.valueOf(valor);
           } catch (Exception e) {
               retorno = STRING_EMPTY;
           }
       }
       return retorno;
   }

   /**
    * Introduzir aqui os comentarios necessarios para o método.
    * 
    * @param valor - String
    * @return - Retorna o valor passado como Long para String.
    */
   public static String getString(final Long valor) {
       String retorno = STRING_EMPTY;
       if (valor != null) {
           try {
               retorno = String.valueOf(valor);
           } catch (Exception e) {
               retorno = STRING_EMPTY;
           }
       }
       return retorno;
   }
   
   /**
	 * Nome: getString Propósito: Método responsável por getString.
	 * 
	 * @param obj
	 * @return
	 * @exception
	 * @see
	 */
	public static String getString(Object obj) {
		if (null == obj) {
			return STRING_EMPTY;
		} else {
			return obj.toString().trim();
		}
	}
   
   /**
	 * Nome: adicionarMensagem
	 * 
	 * Adicionar mensagem.
	 * 
	 * @param messageKey
	 *            the message key
	 * @see
	 */
	public static void adicionarMensagemInformacao(String messageKey) {
		BradescoFacesUtils.addInfoModalMessage(messageKey, true);
	}
	
    /**
     * Compares a given date in the format MMYYYY with December 2015.
     *
     * @param date Input date in the format MMYYYY (e.g., 112024).
     * @return true if the date is before or equal to December 2015, false otherwise.
     */
    public static boolean isSAPDate(int date) {
        int month = date / 10000;
        int year = date % 10000;

        int referenceMonth = 12;
        int referenceYear = 2015;

        if (year < referenceYear) {
            return true;
        } else if (year > referenceYear) {
            return false;
        }

        return month <= referenceMonth;
    }
   
}