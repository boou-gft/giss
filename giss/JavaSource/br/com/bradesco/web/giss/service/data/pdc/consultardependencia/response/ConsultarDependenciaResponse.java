/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ConsultarDependenciaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarDependenciaResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _dataAbertura
     */
    private java.lang.String _dataAbertura;

    /**
     * Field _dataEncerramento
     */
    private java.lang.String _dataEncerramento;

    /**
     * Field _codigoAgenciaIncorporadora
     */
    private int _codigoAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _codigoAgenciaIncorporadora
     */
    private boolean _has_codigoAgenciaIncorporadora;

    /**
     * Field _nomeAgenciaIncorporadora
     */
    private java.lang.String _nomeAgenciaIncorporadora;

    /**
     * Field _enderecoAgenciaIncorporadora
     */
    private java.lang.String _enderecoAgenciaIncorporadora;

    /**
     * Field _numeroAgenciaIncorporadora
     */
    private int _numeroAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _numeroAgenciaIncorporadora
     */
    private boolean _has_numeroAgenciaIncorporadora;

    /**
     * Field _cepAgenciaIncorporadora
     */
    private int _cepAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _cepAgenciaIncorporadora
     */
    private boolean _has_cepAgenciaIncorporadora;

    /**
     * Field _siglaUFAgenciaIncorporadora
     */
    private java.lang.String _siglaUFAgenciaIncorporadora;

    /**
     * Field _paisAgenciaIncorporadora
     */
    private java.lang.String _paisAgenciaIncorporadora;

    /**
     * Field _codigoCadastroContribuinteMobiliario
     */
    private long _codigoCadastroContribuinteMobiliario = 0;

    /**
     * keeps track of state for field:
     * _codigoCadastroContribuinteMobiliario
     */
    private boolean _has_codigoCadastroContribuinteMobiliario;

    /**
     * Field _tipoDepartamento
     */
    private java.lang.String _tipoDepartamento;

    /**
     * Field _codigoDepartamentoAgenciaIncorporadora
     */
    private int _codigoDepartamentoAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field:
     * _codigoDepartamentoAgenciaIncorporadora
     */
    private boolean _has_codigoDepartamentoAgenciaIncorporadora;

    /**
     * Field _descricaoDepartamentoAgenciaIncorporadora
     */
    private java.lang.String _descricaoDepartamentoAgenciaIncorporadora;

    /**
     * Field _inscricaoMunicipal
     */
    private java.lang.String _inscricaoMunicipal;

    /**
     * Field _indicadorTributavelNaoTributavel
     */
    private int _indicadorTributavelNaoTributavel = 0;

    /**
     * keeps track of state for field:
     * _indicadorTributavelNaoTributavel
     */
    private boolean _has_indicadorTributavelNaoTributavel;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _estadoIncorporaDepartamento
     */
    private java.lang.String _estadoIncorporaDepartamento;

    /**
     * Field _codigoMunicipioIncorporaDepartamento
     */
    private java.lang.String _codigoMunicipioIncorporaDepartamento;

    /**
     * Field _descricaoMunicipioIncorporaDepartamento
     */
    private java.lang.String _descricaoMunicipioIncorporaDepartamento;

    /**
     * Field _codigoPessoaAgencIncorpDepto
     */
    private long _codigoPessoaAgencIncorpDepto = 0;

    /**
     * keeps track of state for field: _codigoPessoaAgencIncorpDepto
     */
    private boolean _has_codigoPessoaAgencIncorpDepto;

    /**
     * Field _numeroSequencAgencIncorpDepto
     */
    private int _numeroSequencAgencIncorpDepto = 0;

    /**
     * keeps track of state for field: _numeroSequencAgencIncorpDept
     */
    private boolean _has_numeroSequencAgencIncorpDepto;

    /**
     * Field _cnpj
     */
    private long _cnpj = 0;

    /**
     * keeps track of state for field: _cnpj
     */
    private boolean _has_cnpj;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _listaConsultarDepList
     */
    private java.util.Vector _listaConsultarDepList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaResponse() 
     {
        super();
        _listaConsultarDepList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaConsultarDep
     * 
     * 
     * 
     * @param vListaConsultarDep
     */
    public void addListaConsultarDep(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep vListaConsultarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarDepList.addElement(vListaConsultarDep);
    } //-- void addListaConsultarDep(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) 

    /**
     * Method addListaConsultarDep
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarDep
     */
    public void addListaConsultarDep(int index, br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep vListaConsultarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaConsultarDepList.insertElementAt(vListaConsultarDep, index);
    } //-- void addListaConsultarDep(int, br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) 

    /**
     * Method deleteCepAgenciaIncorporadora
     * 
     */
    public void deleteCepAgenciaIncorporadora()
    {
        this._has_cepAgenciaIncorporadora= false;
    } //-- void deleteCepAgenciaIncorporadora() 

    /**
     * Method deleteCnpj
     * 
     */
    public void deleteCnpj()
    {
        this._has_cnpj= false;
    } //-- void deleteCnpj() 

    /**
     * Method deleteCodigoAgenciaIncorporadora
     * 
     */
    public void deleteCodigoAgenciaIncorporadora()
    {
        this._has_codigoAgenciaIncorporadora= false;
    } //-- void deleteCodigoAgenciaIncorporadora() 

    /**
     * Method deleteCodigoCadastroContribuinteMobiliario
     * 
     */
    public void deleteCodigoCadastroContribuinteMobiliario()
    {
        this._has_codigoCadastroContribuinteMobiliario= false;
    } //-- void deleteCodigoCadastroContribuinteMobiliario() 

    /**
     * Method deleteCodigoDepartamentoAgenciaIncorporadora
     * 
     */
    public void deleteCodigoDepartamentoAgenciaIncorporadora()
    {
        this._has_codigoDepartamentoAgenciaIncorporadora= false;
    } //-- void deleteCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaAgencIncorpDepto
     * 
     */
    public void deleteCodigoPessoaAgencIncorpDepto()
    {
        this._has_codigoPessoaAgencIncorpDepto= false;
    } //-- void deleteCodigoPessoaAgencIncorpDepto() 

    /**
     * Method deleteIndicadorTributavelNaoTributavel
     * 
     */
    public void deleteIndicadorTributavelNaoTributavel()
    {
        this._has_indicadorTributavelNaoTributavel= false;
    } //-- void deleteIndicadorTributavelNaoTributavel() 

    /**
     * Method deleteNumeroAgenciaIncorporadora
     * 
     */
    public void deleteNumeroAgenciaIncorporadora()
    {
        this._has_numeroAgenciaIncorporadora= false;
    } //-- void deleteNumeroAgenciaIncorporadora() 

    /**
     * Method deleteNumeroSequencAgencIncorpDepto
     * 
     */
    public void deleteNumeroSequencAgencIncorpDepto()
    {
        this._has_numeroSequencAgencIncorpDepto= false;
    } //-- void deleteNumeroSequencAgencIncorpDepto() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaConsultarDep
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaConsultarDep()
    {
        return _listaConsultarDepList.elements();
    } //-- java.util.Enumeration enumerateListaConsultarDep() 

    /**
     * Returns the value of field 'cepAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'cepAgenciaIncorporadora'.
     */
    public int getCepAgenciaIncorporadora()
    {
        return this._cepAgenciaIncorporadora;
    } //-- int getCepAgenciaIncorporadora() 

    /**
     * Returns the value of field 'cnpj'.
     * 
     * @return long
     * @return the value of field 'cnpj'.
     */
    public long getCnpj()
    {
        return this._cnpj;
    } //-- long getCnpj() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'codigoAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'codigoAgenciaIncorporadora'.
     */
    public int getCodigoAgenciaIncorporadora()
    {
        return this._codigoAgenciaIncorporadora;
    } //-- int getCodigoAgenciaIncorporadora() 

    /**
     * Returns the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     * 
     * @return long
     * @return the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     */
    public long getCodigoCadastroContribuinteMobiliario()
    {
        return this._codigoCadastroContribuinteMobiliario;
    } //-- long getCodigoCadastroContribuinteMobiliario() 

    /**
     * Returns the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     */
    public int getCodigoDepartamentoAgenciaIncorporadora()
    {
        return this._codigoDepartamentoAgenciaIncorporadora;
    } //-- int getCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     */
    public java.lang.String getCodigoMunicipioIncorporaDepartamento()
    {
        return this._codigoMunicipioIncorporaDepartamento;
    } //-- java.lang.String getCodigoMunicipioIncorporaDepartamento() 

    /**
     * Returns the value of field 'codigoPessoaAgencIncorpDepto'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaAgencIncorpDepto'.
     */
    public long getCodigoPessoaAgencIncorpDepto()
    {
        return this._codigoPessoaAgencIncorpDepto;
    } //-- long getCodigoPessoaAgencIncorpDepto() 

    /**
     * Returns the value of field 'dataAbertura'.
     * 
     * @return String
     * @return the value of field 'dataAbertura'.
     */
    public java.lang.String getDataAbertura()
    {
        return this._dataAbertura;
    } //-- java.lang.String getDataAbertura() 

    /**
     * Returns the value of field 'dataEncerramento'.
     * 
     * @return String
     * @return the value of field 'dataEncerramento'.
     */
    public java.lang.String getDataEncerramento()
    {
        return this._dataEncerramento;
    } //-- java.lang.String getDataEncerramento() 

    /**
     * Returns the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     */
    public java.lang.String getDescricaoDepartamentoAgenciaIncorporadora()
    {
        return this._descricaoDepartamentoAgenciaIncorporadora;
    } //-- java.lang.String getDescricaoDepartamentoAgenciaIncorporadora() 

    /**
     * Returns the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     */
    public java.lang.String getDescricaoMunicipioIncorporaDepartamento()
    {
        return this._descricaoMunicipioIncorporaDepartamento;
    } //-- java.lang.String getDescricaoMunicipioIncorporaDepartamento() 

    /**
     * Returns the value of field 'enderecoAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'enderecoAgenciaIncorporadora'.
     */
    public java.lang.String getEnderecoAgenciaIncorporadora()
    {
        return this._enderecoAgenciaIncorporadora;
    } //-- java.lang.String getEnderecoAgenciaIncorporadora() 

    /**
     * Returns the value of field 'estadoIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field 'estadoIncorporaDepartamento'.
     */
    public java.lang.String getEstadoIncorporaDepartamento()
    {
        return this._estadoIncorporaDepartamento;
    } //-- java.lang.String getEstadoIncorporaDepartamento() 

    /**
     * Returns the value of field
     * 'indicadorTributavelNaoTributavel'.
     * 
     * @return int
     * @return the value of field 'indicadorTributavelNaoTributavel'
     */
    public int getIndicadorTributavelNaoTributavel()
    {
        return this._indicadorTributavelNaoTributavel;
    } //-- int getIndicadorTributavelNaoTributavel() 

    /**
     * Returns the value of field 'inscricaoMunicipal'.
     * 
     * @return String
     * @return the value of field 'inscricaoMunicipal'.
     */
    public java.lang.String getInscricaoMunicipal()
    {
        return this._inscricaoMunicipal;
    } //-- java.lang.String getInscricaoMunicipal() 

    /**
     * Method getListaConsultarDep
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep getListaConsultarDep(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarDepList.size())) {
            throw new IndexOutOfBoundsException("getListaConsultarDep: Index value '"+index+"' not in range [0.."+(_listaConsultarDepList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) _listaConsultarDepList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep getListaConsultarDep(int) 

    /**
     * Method getListaConsultarDep
     * 
     * 
     * 
     * @return ListaConsultarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep[] getListaConsultarDep()
    {
        int size = _listaConsultarDepList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) _listaConsultarDepList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep[] getListaConsultarDep() 

    /**
     * Method getListaConsultarDepCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaConsultarDepCount()
    {
        return _listaConsultarDepList.size();
    } //-- int getListaConsultarDepCount() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'nomeAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'nomeAgenciaIncorporadora'.
     */
    public java.lang.String getNomeAgenciaIncorporadora()
    {
        return this._nomeAgenciaIncorporadora;
    } //-- java.lang.String getNomeAgenciaIncorporadora() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

    /**
     * Returns the value of field 'numeroAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'numeroAgenciaIncorporadora'.
     */
    public int getNumeroAgenciaIncorporadora()
    {
        return this._numeroAgenciaIncorporadora;
    } //-- int getNumeroAgenciaIncorporadora() 

    /**
     * Returns the value of field 'numeroSequencAgencIncorpDepto'.
     * 
     * @return int
     * @return the value of field 'numeroSequencAgencIncorpDepto'.
     */
    public int getNumeroSequencAgencIncorpDepto()
    {
        return this._numeroSequencAgencIncorpDepto;
    } //-- int getNumeroSequencAgencIncorpDepto() 

    /**
     * Returns the value of field 'paisAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'paisAgenciaIncorporadora'.
     */
    public java.lang.String getPaisAgenciaIncorporadora()
    {
        return this._paisAgenciaIncorporadora;
    } //-- java.lang.String getPaisAgenciaIncorporadora() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Returns the value of field 'siglaUFAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'siglaUFAgenciaIncorporadora'.
     */
    public java.lang.String getSiglaUFAgenciaIncorporadora()
    {
        return this._siglaUFAgenciaIncorporadora;
    } //-- java.lang.String getSiglaUFAgenciaIncorporadora() 

    /**
     * Returns the value of field 'tipoDepartamento'.
     * 
     * @return String
     * @return the value of field 'tipoDepartamento'.
     */
    public java.lang.String getTipoDepartamento()
    {
        return this._tipoDepartamento;
    } //-- java.lang.String getTipoDepartamento() 

    /**
     * Method hasCepAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepAgenciaIncorporadora()
    {
        return this._has_cepAgenciaIncorporadora;
    } //-- boolean hasCepAgenciaIncorporadora() 

    /**
     * Method hasCnpj
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpj()
    {
        return this._has_cnpj;
    } //-- boolean hasCnpj() 

    /**
     * Method hasCodigoAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoAgenciaIncorporadora()
    {
        return this._has_codigoAgenciaIncorporadora;
    } //-- boolean hasCodigoAgenciaIncorporadora() 

    /**
     * Method hasCodigoCadastroContribuinteMobiliario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCadastroContribuinteMobiliario()
    {
        return this._has_codigoCadastroContribuinteMobiliario;
    } //-- boolean hasCodigoCadastroContribuinteMobiliario() 

    /**
     * Method hasCodigoDepartamentoAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDepartamentoAgenciaIncorporadora()
    {
        return this._has_codigoDepartamentoAgenciaIncorporadora;
    } //-- boolean hasCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasCodigoPessoaAgencIncorpDepto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaAgencIncorpDepto()
    {
        return this._has_codigoPessoaAgencIncorpDepto;
    } //-- boolean hasCodigoPessoaAgencIncorpDepto() 

    /**
     * Method hasIndicadorTributavelNaoTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorTributavelNaoTributavel()
    {
        return this._has_indicadorTributavelNaoTributavel;
    } //-- boolean hasIndicadorTributavelNaoTributavel() 

    /**
     * Method hasNumeroAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroAgenciaIncorporadora()
    {
        return this._has_numeroAgenciaIncorporadora;
    } //-- boolean hasNumeroAgenciaIncorporadora() 

    /**
     * Method hasNumeroSequencAgencIncorpDepto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencAgencIncorpDepto()
    {
        return this._has_numeroSequencAgencIncorpDepto;
    } //-- boolean hasNumeroSequencAgencIncorpDepto() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllListaConsultarDep
     * 
     */
    public void removeAllListaConsultarDep()
    {
        _listaConsultarDepList.removeAllElements();
    } //-- void removeAllListaConsultarDep() 

    /**
     * Method removeListaConsultarDep
     * 
     * 
     * 
     * @param index
     * @return ListaConsultarDep
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep removeListaConsultarDep(int index)
    {
        java.lang.Object obj = _listaConsultarDepList.elementAt(index);
        _listaConsultarDepList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep removeListaConsultarDep(int) 

    /**
     * Sets the value of field 'cepAgenciaIncorporadora'.
     * 
     * @param cepAgenciaIncorporadora the value of field
     * 'cepAgenciaIncorporadora'.
     */
    public void setCepAgenciaIncorporadora(int cepAgenciaIncorporadora)
    {
        this._cepAgenciaIncorporadora = cepAgenciaIncorporadora;
        this._has_cepAgenciaIncorporadora = true;
    } //-- void setCepAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'cnpj'.
     * 
     * @param cnpj the value of field 'cnpj'.
     */
    public void setCnpj(long cnpj)
    {
        this._cnpj = cnpj;
        this._has_cnpj = true;
    } //-- void setCnpj(long) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'codigoAgenciaIncorporadora'.
     * 
     * @param codigoAgenciaIncorporadora the value of field
     * 'codigoAgenciaIncorporadora'.
     */
    public void setCodigoAgenciaIncorporadora(int codigoAgenciaIncorporadora)
    {
        this._codigoAgenciaIncorporadora = codigoAgenciaIncorporadora;
        this._has_codigoAgenciaIncorporadora = true;
    } //-- void setCodigoAgenciaIncorporadora(int) 

    /**
     * Sets the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     * 
     * @param codigoCadastroContribuinteMobiliario the value of
     * field 'codigoCadastroContribuinteMobiliario'.
     */
    public void setCodigoCadastroContribuinteMobiliario(long codigoCadastroContribuinteMobiliario)
    {
        this._codigoCadastroContribuinteMobiliario = codigoCadastroContribuinteMobiliario;
        this._has_codigoCadastroContribuinteMobiliario = true;
    } //-- void setCodigoCadastroContribuinteMobiliario(long) 

    /**
     * Sets the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     * 
     * @param codigoDepartamentoAgenciaIncorporadora the value of
     * field 'codigoDepartamentoAgenciaIncorporadora'.
     */
    public void setCodigoDepartamentoAgenciaIncorporadora(int codigoDepartamentoAgenciaIncorporadora)
    {
        this._codigoDepartamentoAgenciaIncorporadora = codigoDepartamentoAgenciaIncorporadora;
        this._has_codigoDepartamentoAgenciaIncorporadora = true;
    } //-- void setCodigoDepartamentoAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     * 
     * @param codigoMunicipioIncorporaDepartamento the value of
     * field 'codigoMunicipioIncorporaDepartamento'.
     */
    public void setCodigoMunicipioIncorporaDepartamento(java.lang.String codigoMunicipioIncorporaDepartamento)
    {
        this._codigoMunicipioIncorporaDepartamento = codigoMunicipioIncorporaDepartamento;
    } //-- void setCodigoMunicipioIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'codigoPessoaAgencIncorpDepto'.
     * 
     * @param codigoPessoaAgencIncorpDepto the value of field
     * 'codigoPessoaAgencIncorpDepto'.
     */
    public void setCodigoPessoaAgencIncorpDepto(long codigoPessoaAgencIncorpDepto)
    {
        this._codigoPessoaAgencIncorpDepto = codigoPessoaAgencIncorpDepto;
        this._has_codigoPessoaAgencIncorpDepto = true;
    } //-- void setCodigoPessoaAgencIncorpDepto(long) 

    /**
     * Sets the value of field 'dataAbertura'.
     * 
     * @param dataAbertura the value of field 'dataAbertura'.
     */
    public void setDataAbertura(java.lang.String dataAbertura)
    {
        this._dataAbertura = dataAbertura;
    } //-- void setDataAbertura(java.lang.String) 

    /**
     * Sets the value of field 'dataEncerramento'.
     * 
     * @param dataEncerramento the value of field 'dataEncerramento'
     */
    public void setDataEncerramento(java.lang.String dataEncerramento)
    {
        this._dataEncerramento = dataEncerramento;
    } //-- void setDataEncerramento(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     * 
     * @param descricaoDepartamentoAgenciaIncorporadora the value
     * of field 'descricaoDepartamentoAgenciaIncorporadora'.
     */
    public void setDescricaoDepartamentoAgenciaIncorporadora(java.lang.String descricaoDepartamentoAgenciaIncorporadora)
    {
        this._descricaoDepartamentoAgenciaIncorporadora = descricaoDepartamentoAgenciaIncorporadora;
    } //-- void setDescricaoDepartamentoAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     * 
     * @param descricaoMunicipioIncorporaDepartamento the value of
     * field 'descricaoMunicipioIncorporaDepartamento'.
     */
    public void setDescricaoMunicipioIncorporaDepartamento(java.lang.String descricaoMunicipioIncorporaDepartamento)
    {
        this._descricaoMunicipioIncorporaDepartamento = descricaoMunicipioIncorporaDepartamento;
    } //-- void setDescricaoMunicipioIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'enderecoAgenciaIncorporadora'.
     * 
     * @param enderecoAgenciaIncorporadora the value of field
     * 'enderecoAgenciaIncorporadora'.
     */
    public void setEnderecoAgenciaIncorporadora(java.lang.String enderecoAgenciaIncorporadora)
    {
        this._enderecoAgenciaIncorporadora = enderecoAgenciaIncorporadora;
    } //-- void setEnderecoAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'estadoIncorporaDepartamento'.
     * 
     * @param estadoIncorporaDepartamento the value of field
     * 'estadoIncorporaDepartamento'.
     */
    public void setEstadoIncorporaDepartamento(java.lang.String estadoIncorporaDepartamento)
    {
        this._estadoIncorporaDepartamento = estadoIncorporaDepartamento;
    } //-- void setEstadoIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'indicadorTributavelNaoTributavel'.
     * 
     * @param indicadorTributavelNaoTributavel the value of field
     * 'indicadorTributavelNaoTributavel'.
     */
    public void setIndicadorTributavelNaoTributavel(int indicadorTributavelNaoTributavel)
    {
        this._indicadorTributavelNaoTributavel = indicadorTributavelNaoTributavel;
        this._has_indicadorTributavelNaoTributavel = true;
    } //-- void setIndicadorTributavelNaoTributavel(int) 

    /**
     * Sets the value of field 'inscricaoMunicipal'.
     * 
     * @param inscricaoMunicipal the value of field
     * 'inscricaoMunicipal'.
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal)
    {
        this._inscricaoMunicipal = inscricaoMunicipal;
    } //-- void setInscricaoMunicipal(java.lang.String) 

    /**
     * Method setListaConsultarDep
     * 
     * 
     * 
     * @param index
     * @param vListaConsultarDep
     */
    public void setListaConsultarDep(int index, br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep vListaConsultarDep)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaConsultarDepList.size())) {
            throw new IndexOutOfBoundsException("setListaConsultarDep: Index value '"+index+"' not in range [0.." + (_listaConsultarDepList.size() - 1) + "]");
        }
        _listaConsultarDepList.setElementAt(vListaConsultarDep, index);
    } //-- void setListaConsultarDep(int, br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) 

    /**
     * Method setListaConsultarDep
     * 
     * 
     * 
     * @param listaConsultarDepArray
     */
    public void setListaConsultarDep(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep[] listaConsultarDepArray)
    {
        //-- copy array
        _listaConsultarDepList.removeAllElements();
        for (int i = 0; i < listaConsultarDepArray.length; i++) {
            _listaConsultarDepList.addElement(listaConsultarDepArray[i]);
        }
    } //-- void setListaConsultarDep(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ListaConsultarDep) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'nomeAgenciaIncorporadora'.
     * 
     * @param nomeAgenciaIncorporadora the value of field
     * 'nomeAgenciaIncorporadora'.
     */
    public void setNomeAgenciaIncorporadora(java.lang.String nomeAgenciaIncorporadora)
    {
        this._nomeAgenciaIncorporadora = nomeAgenciaIncorporadora;
    } //-- void setNomeAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'numeroAgenciaIncorporadora'.
     * 
     * @param numeroAgenciaIncorporadora the value of field
     * 'numeroAgenciaIncorporadora'.
     */
    public void setNumeroAgenciaIncorporadora(int numeroAgenciaIncorporadora)
    {
        this._numeroAgenciaIncorporadora = numeroAgenciaIncorporadora;
        this._has_numeroAgenciaIncorporadora = true;
    } //-- void setNumeroAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'numeroSequencAgencIncorpDepto'.
     * 
     * @param numeroSequencAgencIncorpDepto the value of field
     * 'numeroSequencAgencIncorpDepto'.
     */
    public void setNumeroSequencAgencIncorpDepto(int numeroSequencAgencIncorpDepto)
    {
        this._numeroSequencAgencIncorpDepto = numeroSequencAgencIncorpDepto;
        this._has_numeroSequencAgencIncorpDepto = true;
    } //-- void setNumeroSequencAgencIncorpDepto(int) 

    /**
     * Sets the value of field 'paisAgenciaIncorporadora'.
     * 
     * @param paisAgenciaIncorporadora the value of field
     * 'paisAgenciaIncorporadora'.
     */
    public void setPaisAgenciaIncorporadora(java.lang.String paisAgenciaIncorporadora)
    {
        this._paisAgenciaIncorporadora = paisAgenciaIncorporadora;
    } //-- void setPaisAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Sets the value of field 'siglaUFAgenciaIncorporadora'.
     * 
     * @param siglaUFAgenciaIncorporadora the value of field
     * 'siglaUFAgenciaIncorporadora'.
     */
    public void setSiglaUFAgenciaIncorporadora(java.lang.String siglaUFAgenciaIncorporadora)
    {
        this._siglaUFAgenciaIncorporadora = siglaUFAgenciaIncorporadora;
    } //-- void setSiglaUFAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'tipoDepartamento'.
     * 
     * @param tipoDepartamento the value of field 'tipoDepartamento'
     */
    public void setTipoDepartamento(java.lang.String tipoDepartamento)
    {
        this._tipoDepartamento = tipoDepartamento;
    } //-- void setTipoDepartamento(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.response.ConsultarDependenciaResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
