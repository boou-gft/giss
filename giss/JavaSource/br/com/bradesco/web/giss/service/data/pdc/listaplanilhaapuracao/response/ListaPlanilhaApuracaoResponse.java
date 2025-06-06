/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaPlanilhaApuracaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListaPlanilhaApuracaoResponse implements java.io.Serializable {


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
     * Field _codAgenciaDev
     */
    private int _codAgenciaDev = 0;

    /**
     * keeps track of state for field: _codAgenciaDev
     */
    private boolean _has_codAgenciaDev;

    /**
     * Field _descAgenciaDev
     */
    private java.lang.String _descAgenciaDev;

    /**
     * Field _descUf
     */
    private java.lang.String _descUf;

    /**
     * Field _cnpj
     */
    private long _cnpj = 0;

    /**
     * keeps track of state for field: _cnpj
     */
    private boolean _has_cnpj;

    /**
     * Field _inscMunicipial
     */
    private java.lang.String _inscMunicipial;

    /**
     * Field _endereco
     */
    private java.lang.String _endereco;

    /**
     * Field _cep
     */
    private int _cep = 0;

    /**
     * keeps track of state for field: _cep
     */
    private boolean _has_cep;

    /**
     * Field _complementoCep
     */
    private int _complementoCep = 0;

    /**
     * keeps track of state for field: _complementoCep
     */
    private boolean _has_complementoCep;

    /**
     * Field _codAgenciaCentralizadora
     */
    private int _codAgenciaCentralizadora = 0;

    /**
     * keeps track of state for field: _codAgenciaCentralizadora
     */
    private boolean _has_codAgenciaCentralizadora;

    /**
     * Field _digAgenciaCentralizadora
     */
    private java.lang.String _digAgenciaCentralizadora;

    /**
     * Field _descAgenciaCentralizadora
     */
    private java.lang.String _descAgenciaCentralizadora;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _digitoMunicipio
     */
    private java.lang.String _digitoMunicipio;

    /**
     * Field _anoContencia
     */
    private int _anoContencia = 0;

    /**
     * keeps track of state for field: _anoContencia
     */
    private boolean _has_anoContencia;

    /**
     * Field _diaVenciemtnoTributo
     */
    private int _diaVenciemtnoTributo = 0;

    /**
     * keeps track of state for field: _diaVenciemtnoTributo
     */
    private boolean _has_diaVenciemtnoTributo;

    /**
     * Field _qtdOcorrencias
     */
    private int _qtdOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdOcorrencias
     */
    private boolean _has_qtdOcorrencias;

    /**
     * Field _ocorrenciasPlanApuracaoList
     */
    private java.util.Vector _ocorrenciasPlanApuracaoList;

    /**
     * Field _sinalRedutorTotal
     */
    private java.lang.String _sinalRedutorTotal;

    /**
     * Field _valorRedutorTotal
     */
    private java.math.BigDecimal _valorRedutorTotal = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalReceita
     */
    private java.math.BigDecimal _valorTotalReceita = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalIss
     */
    private java.math.BigDecimal _valorTotalIss = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaPlanilhaApuracaoResponse() 
     {
        super();
        _ocorrenciasPlanApuracaoList = new Vector();
        setValorRedutorTotal(new java.math.BigDecimal("0"));
        setValorTotalReceita(new java.math.BigDecimal("0"));
        setValorTotalIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param vOcorrenciasPlanApuracao
     */
    public void addOcorrenciasPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao vOcorrenciasPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasPlanApuracaoList.addElement(vOcorrenciasPlanApuracao);
    } //-- void addOcorrenciasPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) 

    /**
     * Method addOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasPlanApuracao
     */
    public void addOcorrenciasPlanApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao vOcorrenciasPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasPlanApuracaoList.insertElementAt(vOcorrenciasPlanApuracao, index);
    } //-- void addOcorrenciasPlanApuracao(int, br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) 

    /**
     * Method deleteAnoContencia
     * 
     */
    public void deleteAnoContencia()
    {
        this._has_anoContencia= false;
    } //-- void deleteAnoContencia() 

    /**
     * Method deleteCep
     * 
     */
    public void deleteCep()
    {
        this._has_cep= false;
    } //-- void deleteCep() 

    /**
     * Method deleteCnpj
     * 
     */
    public void deleteCnpj()
    {
        this._has_cnpj= false;
    } //-- void deleteCnpj() 

    /**
     * Method deleteCodAgenciaCentralizadora
     * 
     */
    public void deleteCodAgenciaCentralizadora()
    {
        this._has_codAgenciaCentralizadora= false;
    } //-- void deleteCodAgenciaCentralizadora() 

    /**
     * Method deleteCodAgenciaDev
     * 
     */
    public void deleteCodAgenciaDev()
    {
        this._has_codAgenciaDev= false;
    } //-- void deleteCodAgenciaDev() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteComplementoCep
     * 
     */
    public void deleteComplementoCep()
    {
        this._has_complementoCep= false;
    } //-- void deleteComplementoCep() 

    /**
     * Method deleteDiaVenciemtnoTributo
     * 
     */
    public void deleteDiaVenciemtnoTributo()
    {
        this._has_diaVenciemtnoTributo= false;
    } //-- void deleteDiaVenciemtnoTributo() 

    /**
     * Method deleteQtdOcorrencias
     * 
     */
    public void deleteQtdOcorrencias()
    {
        this._has_qtdOcorrencias= false;
    } //-- void deleteQtdOcorrencias() 

    /**
     * Method enumerateOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrenciasPlanApuracao()
    {
        return _ocorrenciasPlanApuracaoList.elements();
    } //-- java.util.Enumeration enumerateOcorrenciasPlanApuracao() 

    /**
     * Returns the value of field 'anoContencia'.
     * 
     * @return int
     * @return the value of field 'anoContencia'.
     */
    public int getAnoContencia()
    {
        return this._anoContencia;
    } //-- int getAnoContencia() 

    /**
     * Returns the value of field 'cep'.
     * 
     * @return int
     * @return the value of field 'cep'.
     */
    public int getCep()
    {
        return this._cep;
    } //-- int getCep() 

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
     * Returns the value of field 'codAgenciaCentralizadora'.
     * 
     * @return int
     * @return the value of field 'codAgenciaCentralizadora'.
     */
    public int getCodAgenciaCentralizadora()
    {
        return this._codAgenciaCentralizadora;
    } //-- int getCodAgenciaCentralizadora() 

    /**
     * Returns the value of field 'codAgenciaDev'.
     * 
     * @return int
     * @return the value of field 'codAgenciaDev'.
     */
    public int getCodAgenciaDev()
    {
        return this._codAgenciaDev;
    } //-- int getCodAgenciaDev() 

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
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'complementoCep'.
     * 
     * @return int
     * @return the value of field 'complementoCep'.
     */
    public int getComplementoCep()
    {
        return this._complementoCep;
    } //-- int getComplementoCep() 

    /**
     * Returns the value of field 'descAgenciaCentralizadora'.
     * 
     * @return String
     * @return the value of field 'descAgenciaCentralizadora'.
     */
    public java.lang.String getDescAgenciaCentralizadora()
    {
        return this._descAgenciaCentralizadora;
    } //-- java.lang.String getDescAgenciaCentralizadora() 

    /**
     * Returns the value of field 'descAgenciaDev'.
     * 
     * @return String
     * @return the value of field 'descAgenciaDev'.
     */
    public java.lang.String getDescAgenciaDev()
    {
        return this._descAgenciaDev;
    } //-- java.lang.String getDescAgenciaDev() 

    /**
     * Returns the value of field 'descUf'.
     * 
     * @return String
     * @return the value of field 'descUf'.
     */
    public java.lang.String getDescUf()
    {
        return this._descUf;
    } //-- java.lang.String getDescUf() 

    /**
     * Returns the value of field 'diaVenciemtnoTributo'.
     * 
     * @return int
     * @return the value of field 'diaVenciemtnoTributo'.
     */
    public int getDiaVenciemtnoTributo()
    {
        return this._diaVenciemtnoTributo;
    } //-- int getDiaVenciemtnoTributo() 

    /**
     * Returns the value of field 'digAgenciaCentralizadora'.
     * 
     * @return String
     * @return the value of field 'digAgenciaCentralizadora'.
     */
    public java.lang.String getDigAgenciaCentralizadora()
    {
        return this._digAgenciaCentralizadora;
    } //-- java.lang.String getDigAgenciaCentralizadora() 

    /**
     * Returns the value of field 'digitoMunicipio'.
     * 
     * @return String
     * @return the value of field 'digitoMunicipio'.
     */
    public java.lang.String getDigitoMunicipio()
    {
        return this._digitoMunicipio;
    } //-- java.lang.String getDigitoMunicipio() 

    /**
     * Returns the value of field 'endereco'.
     * 
     * @return String
     * @return the value of field 'endereco'.
     */
    public java.lang.String getEndereco()
    {
        return this._endereco;
    } //-- java.lang.String getEndereco() 

    /**
     * Returns the value of field 'inscMunicipial'.
     * 
     * @return String
     * @return the value of field 'inscMunicipial'.
     */
    public java.lang.String getInscMunicipial()
    {
        return this._inscMunicipial;
    } //-- java.lang.String getInscMunicipial() 

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
     * Method getOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao getOcorrenciasPlanApuracao(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasPlanApuracaoList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasPlanApuracao: Index value '"+index+"' not in range [0.."+(_ocorrenciasPlanApuracaoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) _ocorrenciasPlanApuracaoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao getOcorrenciasPlanApuracao(int) 

    /**
     * Method getOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @return OcorrenciasPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao[] getOcorrenciasPlanApuracao()
    {
        int size = _ocorrenciasPlanApuracaoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) _ocorrenciasPlanApuracaoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao[] getOcorrenciasPlanApuracao() 

    /**
     * Method getOcorrenciasPlanApuracaoCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasPlanApuracaoCount()
    {
        return _ocorrenciasPlanApuracaoList.size();
    } //-- int getOcorrenciasPlanApuracaoCount() 

    /**
     * Returns the value of field 'qtdOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdOcorrencias'.
     */
    public int getQtdOcorrencias()
    {
        return this._qtdOcorrencias;
    } //-- int getQtdOcorrencias() 

    /**
     * Returns the value of field 'sinalRedutorTotal'.
     * 
     * @return String
     * @return the value of field 'sinalRedutorTotal'.
     */
    public java.lang.String getSinalRedutorTotal()
    {
        return this._sinalRedutorTotal;
    } //-- java.lang.String getSinalRedutorTotal() 

    /**
     * Returns the value of field 'valorRedutorTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRedutorTotal'.
     */
    public java.math.BigDecimal getValorRedutorTotal()
    {
        return this._valorRedutorTotal;
    } //-- java.math.BigDecimal getValorRedutorTotal() 

    /**
     * Returns the value of field 'valorTotalIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalIss'.
     */
    public java.math.BigDecimal getValorTotalIss()
    {
        return this._valorTotalIss;
    } //-- java.math.BigDecimal getValorTotalIss() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceita'.
     */
    public java.math.BigDecimal getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- java.math.BigDecimal getValorTotalReceita() 

    /**
     * Method hasAnoContencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoContencia()
    {
        return this._has_anoContencia;
    } //-- boolean hasAnoContencia() 

    /**
     * Method hasCep
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCep()
    {
        return this._has_cep;
    } //-- boolean hasCep() 

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
     * Method hasCodAgenciaCentralizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodAgenciaCentralizadora()
    {
        return this._has_codAgenciaCentralizadora;
    } //-- boolean hasCodAgenciaCentralizadora() 

    /**
     * Method hasCodAgenciaDev
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodAgenciaDev()
    {
        return this._has_codAgenciaDev;
    } //-- boolean hasCodAgenciaDev() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasComplementoCep
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasComplementoCep()
    {
        return this._has_complementoCep;
    } //-- boolean hasComplementoCep() 

    /**
     * Method hasDiaVenciemtnoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVenciemtnoTributo()
    {
        return this._has_diaVenciemtnoTributo;
    } //-- boolean hasDiaVenciemtnoTributo() 

    /**
     * Method hasQtdOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdOcorrencias()
    {
        return this._has_qtdOcorrencias;
    } //-- boolean hasQtdOcorrencias() 

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
     * Method removeAllOcorrenciasPlanApuracao
     * 
     */
    public void removeAllOcorrenciasPlanApuracao()
    {
        _ocorrenciasPlanApuracaoList.removeAllElements();
    } //-- void removeAllOcorrenciasPlanApuracao() 

    /**
     * Method removeOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao removeOcorrenciasPlanApuracao(int index)
    {
        java.lang.Object obj = _ocorrenciasPlanApuracaoList.elementAt(index);
        _ocorrenciasPlanApuracaoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao removeOcorrenciasPlanApuracao(int) 

    /**
     * Sets the value of field 'anoContencia'.
     * 
     * @param anoContencia the value of field 'anoContencia'.
     */
    public void setAnoContencia(int anoContencia)
    {
        this._anoContencia = anoContencia;
        this._has_anoContencia = true;
    } //-- void setAnoContencia(int) 

    /**
     * Sets the value of field 'cep'.
     * 
     * @param cep the value of field 'cep'.
     */
    public void setCep(int cep)
    {
        this._cep = cep;
        this._has_cep = true;
    } //-- void setCep(int) 

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
     * Sets the value of field 'codAgenciaCentralizadora'.
     * 
     * @param codAgenciaCentralizadora the value of field
     * 'codAgenciaCentralizadora'.
     */
    public void setCodAgenciaCentralizadora(int codAgenciaCentralizadora)
    {
        this._codAgenciaCentralizadora = codAgenciaCentralizadora;
        this._has_codAgenciaCentralizadora = true;
    } //-- void setCodAgenciaCentralizadora(int) 

    /**
     * Sets the value of field 'codAgenciaDev'.
     * 
     * @param codAgenciaDev the value of field 'codAgenciaDev'.
     */
    public void setCodAgenciaDev(int codAgenciaDev)
    {
        this._codAgenciaDev = codAgenciaDev;
        this._has_codAgenciaDev = true;
    } //-- void setCodAgenciaDev(int) 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'complementoCep'.
     * 
     * @param complementoCep the value of field 'complementoCep'.
     */
    public void setComplementoCep(int complementoCep)
    {
        this._complementoCep = complementoCep;
        this._has_complementoCep = true;
    } //-- void setComplementoCep(int) 

    /**
     * Sets the value of field 'descAgenciaCentralizadora'.
     * 
     * @param descAgenciaCentralizadora the value of field
     * 'descAgenciaCentralizadora'.
     */
    public void setDescAgenciaCentralizadora(java.lang.String descAgenciaCentralizadora)
    {
        this._descAgenciaCentralizadora = descAgenciaCentralizadora;
    } //-- void setDescAgenciaCentralizadora(java.lang.String) 

    /**
     * Sets the value of field 'descAgenciaDev'.
     * 
     * @param descAgenciaDev the value of field 'descAgenciaDev'.
     */
    public void setDescAgenciaDev(java.lang.String descAgenciaDev)
    {
        this._descAgenciaDev = descAgenciaDev;
    } //-- void setDescAgenciaDev(java.lang.String) 

    /**
     * Sets the value of field 'descUf'.
     * 
     * @param descUf the value of field 'descUf'.
     */
    public void setDescUf(java.lang.String descUf)
    {
        this._descUf = descUf;
    } //-- void setDescUf(java.lang.String) 

    /**
     * Sets the value of field 'diaVenciemtnoTributo'.
     * 
     * @param diaVenciemtnoTributo the value of field
     * 'diaVenciemtnoTributo'.
     */
    public void setDiaVenciemtnoTributo(int diaVenciemtnoTributo)
    {
        this._diaVenciemtnoTributo = diaVenciemtnoTributo;
        this._has_diaVenciemtnoTributo = true;
    } //-- void setDiaVenciemtnoTributo(int) 

    /**
     * Sets the value of field 'digAgenciaCentralizadora'.
     * 
     * @param digAgenciaCentralizadora the value of field
     * 'digAgenciaCentralizadora'.
     */
    public void setDigAgenciaCentralizadora(java.lang.String digAgenciaCentralizadora)
    {
        this._digAgenciaCentralizadora = digAgenciaCentralizadora;
    } //-- void setDigAgenciaCentralizadora(java.lang.String) 

    /**
     * Sets the value of field 'digitoMunicipio'.
     * 
     * @param digitoMunicipio the value of field 'digitoMunicipio'.
     */
    public void setDigitoMunicipio(java.lang.String digitoMunicipio)
    {
        this._digitoMunicipio = digitoMunicipio;
    } //-- void setDigitoMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'endereco'.
     * 
     * @param endereco the value of field 'endereco'.
     */
    public void setEndereco(java.lang.String endereco)
    {
        this._endereco = endereco;
    } //-- void setEndereco(java.lang.String) 

    /**
     * Sets the value of field 'inscMunicipial'.
     * 
     * @param inscMunicipial the value of field 'inscMunicipial'.
     */
    public void setInscMunicipial(java.lang.String inscMunicipial)
    {
        this._inscMunicipial = inscMunicipial;
    } //-- void setInscMunicipial(java.lang.String) 

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
     * Method setOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasPlanApuracao
     */
    public void setOcorrenciasPlanApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao vOcorrenciasPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasPlanApuracaoList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasPlanApuracao: Index value '"+index+"' not in range [0.." + (_ocorrenciasPlanApuracaoList.size() - 1) + "]");
        }
        _ocorrenciasPlanApuracaoList.setElementAt(vOcorrenciasPlanApuracao, index);
    } //-- void setOcorrenciasPlanApuracao(int, br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) 

    /**
     * Method setOcorrenciasPlanApuracao
     * 
     * 
     * 
     * @param ocorrenciasPlanApuracaoArray
     */
    public void setOcorrenciasPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao[] ocorrenciasPlanApuracaoArray)
    {
        //-- copy array
        _ocorrenciasPlanApuracaoList.removeAllElements();
        for (int i = 0; i < ocorrenciasPlanApuracaoArray.length; i++) {
            _ocorrenciasPlanApuracaoList.addElement(ocorrenciasPlanApuracaoArray[i]);
        }
    } //-- void setOcorrenciasPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.OcorrenciasPlanApuracao) 

    /**
     * Sets the value of field 'qtdOcorrencias'.
     * 
     * @param qtdOcorrencias the value of field 'qtdOcorrencias'.
     */
    public void setQtdOcorrencias(int qtdOcorrencias)
    {
        this._qtdOcorrencias = qtdOcorrencias;
        this._has_qtdOcorrencias = true;
    } //-- void setQtdOcorrencias(int) 

    /**
     * Sets the value of field 'sinalRedutorTotal'.
     * 
     * @param sinalRedutorTotal the value of field
     * 'sinalRedutorTotal'.
     */
    public void setSinalRedutorTotal(java.lang.String sinalRedutorTotal)
    {
        this._sinalRedutorTotal = sinalRedutorTotal;
    } //-- void setSinalRedutorTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorRedutorTotal'.
     * 
     * @param valorRedutorTotal the value of field
     * 'valorRedutorTotal'.
     */
    public void setValorRedutorTotal(java.math.BigDecimal valorRedutorTotal)
    {
        this._valorRedutorTotal = valorRedutorTotal;
    } //-- void setValorRedutorTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalIss'.
     * 
     * @param valorTotalIss the value of field 'valorTotalIss'.
     */
    public void setValorTotalIss(java.math.BigDecimal valorTotalIss)
    {
        this._valorTotalIss = valorTotalIss;
    } //-- void setValorTotalIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(java.math.BigDecimal valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
    } //-- void setValorTotalReceita(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaPlanilhaApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.response.ListaPlanilhaApuracaoResponse unmarshal(java.io.Reader) 

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
