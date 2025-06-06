/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:10:41 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:41 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequencialUnidadeOrganizacional
     */
    private int _numeroSequencialUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialUnidadeOrganizacional
     */
    private boolean _has_numeroSequencialUnidadeOrganizacional;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoUnidadeOrganizacionalResponsavel
     */
    private int _codigoUnidadeOrganizacionalResponsavel = 0;

    /**
     * keeps track of state for field:
     * _codigoUnidadeOrganizacionalResponsavel
     */
    private boolean _has_codigoUnidadeOrganizacionalResponsavel;

    /**
     * Field _nomeUnidadeOrganizacionalResponsavel
     */
    private java.lang.String _nomeUnidadeOrganizacionalResponsavel;

    /**
     * Field _diaVencimentoTributo
     */
    private int _diaVencimentoTributo = 0;

    /**
     * keeps track of state for field: _diaVencimentoTributo
     */
    private boolean _has_diaVencimentoTributo;

    /**
     * Field _contabilList
     */
    private java.util.Vector _contabilList;

    /**
     * Field _indicadorSituacaoMensagem
     */
    private int _indicadorSituacaoMensagem = 0;

    /**
     * keeps track of state for field: _indicadorSituacaoMensagem
     */
    private boolean _has_indicadorSituacaoMensagem;

    /**
     * Field _dataAtual
     */
    private java.lang.String _dataAtual;

    /**
     * Field _dataProcessamento
     */
    private java.lang.String _dataProcessamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        _contabilList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addContabil
     * 
     * 
     * 
     * @param vContabil
     */
    public void addContabil(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil vContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        _contabilList.addElement(vContabil);
    } //-- void addContabil(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) 

    /**
     * Method addContabil
     * 
     * 
     * 
     * @param index
     * @param vContabil
     */
    public void addContabil(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil vContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        _contabilList.insertElementAt(vContabil, index);
    } //-- void addContabil(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteCodigoUnidadeOrganizacionalResponsavel
     * 
     */
    public void deleteCodigoUnidadeOrganizacionalResponsavel()
    {
        this._has_codigoUnidadeOrganizacionalResponsavel= false;
    } //-- void deleteCodigoUnidadeOrganizacionalResponsavel() 

    /**
     * Method deleteDiaVencimentoTributo
     * 
     */
    public void deleteDiaVencimentoTributo()
    {
        this._has_diaVencimentoTributo= false;
    } //-- void deleteDiaVencimentoTributo() 

    /**
     * Method deleteIndicadorSituacaoMensagem
     * 
     */
    public void deleteIndicadorSituacaoMensagem()
    {
        this._has_indicadorSituacaoMensagem= false;
    } //-- void deleteIndicadorSituacaoMensagem() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNumeroSequencialUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequencialUnidadeOrganizacional()
    {
        this._has_numeroSequencialUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequencialUnidadeOrganizacional() 

    /**
     * Method enumerateContabil
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateContabil()
    {
        return _contabilList.elements();
    } //-- java.util.Enumeration enumerateContabil() 

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
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field
     * 'codigoUnidadeOrganizacionalResponsavel'.
     * 
     * @return int
     * @return the value of field
     * 'codigoUnidadeOrganizacionalResponsavel'.
     */
    public int getCodigoUnidadeOrganizacionalResponsavel()
    {
        return this._codigoUnidadeOrganizacionalResponsavel;
    } //-- int getCodigoUnidadeOrganizacionalResponsavel() 

    /**
     * Method getContabil
     * 
     * 
     * 
     * @param index
     * @return Contabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil getContabil(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _contabilList.size())) {
            throw new IndexOutOfBoundsException("getContabil: Index value '"+index+"' not in range [0.."+(_contabilList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) _contabilList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil getContabil(int) 

    /**
     * Method getContabil
     * 
     * 
     * 
     * @return Contabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil[] getContabil()
    {
        int size = _contabilList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) _contabilList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil[] getContabil() 

    /**
     * Method getContabilCount
     * 
     * 
     * 
     * @return int
     */
    public int getContabilCount()
    {
        return _contabilList.size();
    } //-- int getContabilCount() 

    /**
     * Returns the value of field 'dataAtual'.
     * 
     * @return String
     * @return the value of field 'dataAtual'.
     */
    public java.lang.String getDataAtual()
    {
        return this._dataAtual;
    } //-- java.lang.String getDataAtual() 

    /**
     * Returns the value of field 'dataProcessamento'.
     * 
     * @return String
     * @return the value of field 'dataProcessamento'.
     */
    public java.lang.String getDataProcessamento()
    {
        return this._dataProcessamento;
    } //-- java.lang.String getDataProcessamento() 

    /**
     * Returns the value of field 'diaVencimentoTributo'.
     * 
     * @return int
     * @return the value of field 'diaVencimentoTributo'.
     */
    public int getDiaVencimentoTributo()
    {
        return this._diaVencimentoTributo;
    } //-- int getDiaVencimentoTributo() 

    /**
     * Returns the value of field 'indicadorSituacaoMensagem'.
     * 
     * @return int
     * @return the value of field 'indicadorSituacaoMensagem'.
     */
    public int getIndicadorSituacaoMensagem()
    {
        return this._indicadorSituacaoMensagem;
    } //-- int getIndicadorSituacaoMensagem() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field
     * 'nomeUnidadeOrganizacionalResponsavel'.
     * 
     * @return String
     * @return the value of field
     * 'nomeUnidadeOrganizacionalResponsavel'.
     */
    public java.lang.String getNomeUnidadeOrganizacionalResponsavel()
    {
        return this._nomeUnidadeOrganizacionalResponsavel;
    } //-- java.lang.String getNomeUnidadeOrganizacionalResponsavel() 

    /**
     * Returns the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     */
    public int getNumeroSequencialUnidadeOrganizacional()
    {
        return this._numeroSequencialUnidadeOrganizacional;
    } //-- int getNumeroSequencialUnidadeOrganizacional() 

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
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasCodigoUnidadeOrganizacionalResponsavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUnidadeOrganizacionalResponsavel()
    {
        return this._has_codigoUnidadeOrganizacionalResponsavel;
    } //-- boolean hasCodigoUnidadeOrganizacionalResponsavel() 

    /**
     * Method hasDiaVencimentoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimentoTributo()
    {
        return this._has_diaVencimentoTributo;
    } //-- boolean hasDiaVencimentoTributo() 

    /**
     * Method hasIndicadorSituacaoMensagem
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorSituacaoMensagem()
    {
        return this._has_indicadorSituacaoMensagem;
    } //-- boolean hasIndicadorSituacaoMensagem() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasNumeroSequencialUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialUnidadeOrganizacional()
    {
        return this._has_numeroSequencialUnidadeOrganizacional;
    } //-- boolean hasNumeroSequencialUnidadeOrganizacional() 

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
     * Method removeAllContabil
     * 
     */
    public void removeAllContabil()
    {
        _contabilList.removeAllElements();
    } //-- void removeAllContabil() 

    /**
     * Method removeContabil
     * 
     * 
     * 
     * @param index
     * @return Contabil
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil removeContabil(int index)
    {
        java.lang.Object obj = _contabilList.elementAt(index);
        _contabilList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil removeContabil(int) 

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
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field
     * 'codigoUnidadeOrganizacionalResponsavel'.
     * 
     * @param codigoUnidadeOrganizacionalResponsavel the value of
     * field 'codigoUnidadeOrganizacionalResponsavel'.
     */
    public void setCodigoUnidadeOrganizacionalResponsavel(int codigoUnidadeOrganizacionalResponsavel)
    {
        this._codigoUnidadeOrganizacionalResponsavel = codigoUnidadeOrganizacionalResponsavel;
        this._has_codigoUnidadeOrganizacionalResponsavel = true;
    } //-- void setCodigoUnidadeOrganizacionalResponsavel(int) 

    /**
     * Method setContabil
     * 
     * 
     * 
     * @param index
     * @param vContabil
     */
    public void setContabil(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil vContabil)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _contabilList.size())) {
            throw new IndexOutOfBoundsException("setContabil: Index value '"+index+"' not in range [0.." + (_contabilList.size() - 1) + "]");
        }
        _contabilList.setElementAt(vContabil, index);
    } //-- void setContabil(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) 

    /**
     * Method setContabil
     * 
     * 
     * 
     * @param contabilArray
     */
    public void setContabil(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil[] contabilArray)
    {
        //-- copy array
        _contabilList.removeAllElements();
        for (int i = 0; i < contabilArray.length; i++) {
            _contabilList.addElement(contabilArray[i]);
        }
    } //-- void setContabil(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) 

    /**
     * Sets the value of field 'dataAtual'.
     * 
     * @param dataAtual the value of field 'dataAtual'.
     */
    public void setDataAtual(java.lang.String dataAtual)
    {
        this._dataAtual = dataAtual;
    } //-- void setDataAtual(java.lang.String) 

    /**
     * Sets the value of field 'dataProcessamento'.
     * 
     * @param dataProcessamento the value of field
     * 'dataProcessamento'.
     */
    public void setDataProcessamento(java.lang.String dataProcessamento)
    {
        this._dataProcessamento = dataProcessamento;
    } //-- void setDataProcessamento(java.lang.String) 

    /**
     * Sets the value of field 'diaVencimentoTributo'.
     * 
     * @param diaVencimentoTributo the value of field
     * 'diaVencimentoTributo'.
     */
    public void setDiaVencimentoTributo(int diaVencimentoTributo)
    {
        this._diaVencimentoTributo = diaVencimentoTributo;
        this._has_diaVencimentoTributo = true;
    } //-- void setDiaVencimentoTributo(int) 

    /**
     * Sets the value of field 'indicadorSituacaoMensagem'.
     * 
     * @param indicadorSituacaoMensagem the value of field
     * 'indicadorSituacaoMensagem'.
     */
    public void setIndicadorSituacaoMensagem(int indicadorSituacaoMensagem)
    {
        this._indicadorSituacaoMensagem = indicadorSituacaoMensagem;
        this._has_indicadorSituacaoMensagem = true;
    } //-- void setIndicadorSituacaoMensagem(int) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field
     * 'nomeUnidadeOrganizacionalResponsavel'.
     * 
     * @param nomeUnidadeOrganizacionalResponsavel the value of
     * field 'nomeUnidadeOrganizacionalResponsavel'.
     */
    public void setNomeUnidadeOrganizacionalResponsavel(java.lang.String nomeUnidadeOrganizacionalResponsavel)
    {
        this._nomeUnidadeOrganizacionalResponsavel = nomeUnidadeOrganizacionalResponsavel;
    } //-- void setNomeUnidadeOrganizacionalResponsavel(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @param numeroSequencialUnidadeOrganizacional the value of
     * field 'numeroSequencialUnidadeOrganizacional'.
     */
    public void setNumeroSequencialUnidadeOrganizacional(int numeroSequencialUnidadeOrganizacional)
    {
        this._numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
        this._has_numeroSequencialUnidadeOrganizacional = true;
    } //-- void setNumeroSequencialUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Ocorrencias unmarshal(java.io.Reader) 

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
