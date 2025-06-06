/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response;

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
 * Class ListarPlanilhaApuracaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPlanilhaApuracaoResponse implements java.io.Serializable {


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
     * Field _mesCompetencia
     */
    private java.lang.String _mesCompetencia;

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
     * Field _listaPlanApuracaoList
     */
    private java.util.Vector _listaPlanApuracaoList;

    /**
     * Field _sinalRedutorTotal
     */
    private java.lang.String _sinalRedutorTotal;

    /**
     * Field _valorRedutorTotal
     */
    private double _valorRedutorTotal = 0;

    /**
     * keeps track of state for field: _valorRedutorTotal
     */
    private boolean _has_valorRedutorTotal;

    /**
     * Field _valorTotalReceita
     */
    private double _valorTotalReceita = 0;

    /**
     * keeps track of state for field: _valorTotalReceita
     */
    private boolean _has_valorTotalReceita;

    /**
     * Field _valorTotalIss
     */
    private double _valorTotalIss = 0;

    /**
     * keeps track of state for field: _valorTotalIss
     */
    private boolean _has_valorTotalIss;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPlanilhaApuracaoResponse() 
     {
        super();
        _listaPlanApuracaoList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaPlanApuracao
     * 
     * 
     * 
     * @param vListaPlanApuracao
     */
    public void addListaPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao vListaPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPlanApuracaoList.addElement(vListaPlanApuracao);
    } //-- void addListaPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) 

    /**
     * Method addListaPlanApuracao
     * 
     * 
     * 
     * @param index
     * @param vListaPlanApuracao
     */
    public void addListaPlanApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao vListaPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaPlanApuracaoList.insertElementAt(vListaPlanApuracao, index);
    } //-- void addListaPlanApuracao(int, br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) 

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
     * Method deleteValorRedutorTotal
     * 
     */
    public void deleteValorRedutorTotal()
    {
        this._has_valorRedutorTotal= false;
    } //-- void deleteValorRedutorTotal() 

    /**
     * Method deleteValorTotalIss
     * 
     */
    public void deleteValorTotalIss()
    {
        this._has_valorTotalIss= false;
    } //-- void deleteValorTotalIss() 

    /**
     * Method deleteValorTotalReceita
     * 
     */
    public void deleteValorTotalReceita()
    {
        this._has_valorTotalReceita= false;
    } //-- void deleteValorTotalReceita() 

    /**
     * Method enumerateListaPlanApuracao
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaPlanApuracao()
    {
        return _listaPlanApuracaoList.elements();
    } //-- java.util.Enumeration enumerateListaPlanApuracao() 

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
     * Method getListaPlanApuracao
     * 
     * 
     * 
     * @param index
     * @return ListaPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao getListaPlanApuracao(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPlanApuracaoList.size())) {
            throw new IndexOutOfBoundsException("getListaPlanApuracao: Index value '"+index+"' not in range [0.."+(_listaPlanApuracaoList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) _listaPlanApuracaoList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao getListaPlanApuracao(int) 

    /**
     * Method getListaPlanApuracao
     * 
     * 
     * 
     * @return ListaPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao[] getListaPlanApuracao()
    {
        int size = _listaPlanApuracaoList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) _listaPlanApuracaoList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao[] getListaPlanApuracao() 

    /**
     * Method getListaPlanApuracaoCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaPlanApuracaoCount()
    {
        return _listaPlanApuracaoList.size();
    } //-- int getListaPlanApuracaoCount() 

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
     * Returns the value of field 'mesCompetencia'.
     * 
     * @return String
     * @return the value of field 'mesCompetencia'.
     */
    public java.lang.String getMesCompetencia()
    {
        return this._mesCompetencia;
    } //-- java.lang.String getMesCompetencia() 

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
     * @return double
     * @return the value of field 'valorRedutorTotal'.
     */
    public double getValorRedutorTotal()
    {
        return this._valorRedutorTotal;
    } //-- double getValorRedutorTotal() 

    /**
     * Returns the value of field 'valorTotalIss'.
     * 
     * @return double
     * @return the value of field 'valorTotalIss'.
     */
    public double getValorTotalIss()
    {
        return this._valorTotalIss;
    } //-- double getValorTotalIss() 

    /**
     * Returns the value of field 'valorTotalReceita'.
     * 
     * @return double
     * @return the value of field 'valorTotalReceita'.
     */
    public double getValorTotalReceita()
    {
        return this._valorTotalReceita;
    } //-- double getValorTotalReceita() 

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
     * Method hasValorRedutorTotal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorRedutorTotal()
    {
        return this._has_valorRedutorTotal;
    } //-- boolean hasValorRedutorTotal() 

    /**
     * Method hasValorTotalIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalIss()
    {
        return this._has_valorTotalIss;
    } //-- boolean hasValorTotalIss() 

    /**
     * Method hasValorTotalReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalReceita()
    {
        return this._has_valorTotalReceita;
    } //-- boolean hasValorTotalReceita() 

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
     * Method removeAllListaPlanApuracao
     * 
     */
    public void removeAllListaPlanApuracao()
    {
        _listaPlanApuracaoList.removeAllElements();
    } //-- void removeAllListaPlanApuracao() 

    /**
     * Method removeListaPlanApuracao
     * 
     * 
     * 
     * @param index
     * @return ListaPlanApuracao
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao removeListaPlanApuracao(int index)
    {
        java.lang.Object obj = _listaPlanApuracaoList.elementAt(index);
        _listaPlanApuracaoList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao removeListaPlanApuracao(int) 

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
     * Method setListaPlanApuracao
     * 
     * 
     * 
     * @param index
     * @param vListaPlanApuracao
     */
    public void setListaPlanApuracao(int index, br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao vListaPlanApuracao)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaPlanApuracaoList.size())) {
            throw new IndexOutOfBoundsException("setListaPlanApuracao: Index value '"+index+"' not in range [0.." + (_listaPlanApuracaoList.size() - 1) + "]");
        }
        _listaPlanApuracaoList.setElementAt(vListaPlanApuracao, index);
    } //-- void setListaPlanApuracao(int, br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) 

    /**
     * Method setListaPlanApuracao
     * 
     * 
     * 
     * @param listaPlanApuracaoArray
     */
    public void setListaPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao[] listaPlanApuracaoArray)
    {
        //-- copy array
        _listaPlanApuracaoList.removeAllElements();
        for (int i = 0; i < listaPlanApuracaoArray.length; i++) {
            _listaPlanApuracaoList.addElement(listaPlanApuracaoArray[i]);
        }
    } //-- void setListaPlanApuracao(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListaPlanApuracao) 

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
     * Sets the value of field 'mesCompetencia'.
     * 
     * @param mesCompetencia the value of field 'mesCompetencia'.
     */
    public void setMesCompetencia(java.lang.String mesCompetencia)
    {
        this._mesCompetencia = mesCompetencia;
    } //-- void setMesCompetencia(java.lang.String) 

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
    public void setValorRedutorTotal(double valorRedutorTotal)
    {
        this._valorRedutorTotal = valorRedutorTotal;
        this._has_valorRedutorTotal = true;
    } //-- void setValorRedutorTotal(double) 

    /**
     * Sets the value of field 'valorTotalIss'.
     * 
     * @param valorTotalIss the value of field 'valorTotalIss'.
     */
    public void setValorTotalIss(double valorTotalIss)
    {
        this._valorTotalIss = valorTotalIss;
        this._has_valorTotalIss = true;
    } //-- void setValorTotalIss(double) 

    /**
     * Sets the value of field 'valorTotalReceita'.
     * 
     * @param valorTotalReceita the value of field
     * 'valorTotalReceita'.
     */
    public void setValorTotalReceita(double valorTotalReceita)
    {
        this._valorTotalReceita = valorTotalReceita;
        this._has_valorTotalReceita = true;
    } //-- void setValorTotalReceita(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPlanilhaApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.ListarPlanilhaApuracaoResponse unmarshal(java.io.Reader) 

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
