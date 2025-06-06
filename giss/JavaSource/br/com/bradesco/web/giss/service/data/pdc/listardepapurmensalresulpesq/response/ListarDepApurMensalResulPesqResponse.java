/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarDepApurMensalResulPesqResponse.java,v 1.1 2017/04/11 14:08:52 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarDepApurMensalResulPesqResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:52 $
 */
public class ListarDepApurMensalResulPesqResponse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

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
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUF
     */
    private java.lang.String _codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _sinalApuracaoTotal
     */
    private java.lang.String _sinalApuracaoTotal;

    /**
     * Field _valorApuracaoTotal
     */
    private java.math.BigDecimal _valorApuracaoTotal = new java.math.BigDecimal("0");

    /**
     * Field _sinallApuracaoTotalMun
     */
    private java.lang.String _sinallApuracaoTotalMun;

    /**
     * Field _valorlApuracaoTotalMun
     */
    private java.math.BigDecimal _valorlApuracaoTotalMun = new java.math.BigDecimal("0");

    /**
     * Field _sinallApuracaoTotalG
     */
    private java.lang.String _sinallApuracaoTotalG;

    /**
     * Field _valorlApuracaoTotalG
     */
    private java.math.BigDecimal _valorlApuracaoTotalG = new java.math.BigDecimal("0");

    /**
     * Field _sinallApuracaoTotalGer
     */
    private java.lang.String _sinallApuracaoTotalGer;

    /**
     * Field _valorlApuracaoTotalGer
     */
    private java.math.BigDecimal _valorlApuracaoTotalGer = new java.math.BigDecimal("0");

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasDepApurMensalResultList
     */
    private java.util.Vector<Object> _ocorrenciasDepApurMensalResultList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDepApurMensalResulPesqResponse() 
     {
        super();
        setValorApuracaoTotal(new java.math.BigDecimal("0"));
        setValorlApuracaoTotalMun(new java.math.BigDecimal("0"));
        setValorlApuracaoTotalG(new java.math.BigDecimal("0"));
        setValorlApuracaoTotalGer(new java.math.BigDecimal("0"));
        _ocorrenciasDepApurMensalResultList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param vOcorrenciasDepApurMensalResult
     */
    public void addOcorrenciasDepApurMensalResult(br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult vOcorrenciasDepApurMensalResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepApurMensalResultList.addElement(vOcorrenciasDepApurMensalResult);
    } //-- void addOcorrenciasDepApurMensalResult(br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) 

    /**
     * Method addOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepApurMensalResult
     */
    public void addOcorrenciasDepApurMensalResult(int index, br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult vOcorrenciasDepApurMensalResult)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepApurMensalResultList.insertElementAt(vOcorrenciasDepApurMensalResult, index);
    } //-- void addOcorrenciasDepApurMensalResult(int, br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Method enumerateOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasDepApurMensalResult()
    {
        return _ocorrenciasDepApurMensalResultList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasDepApurMensalResult() 

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
     * Returns the value of field 'codUF'.
     * 
     * @return String
     * @return the value of field 'codUF'.
     */
    public java.lang.String getCodUF()
    {
        return this._codUF;
    } //-- java.lang.String getCodUF() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

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
     * Method getOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepApurMensalResult
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult getOcorrenciasDepApurMensalResult(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepApurMensalResultList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasDepApurMensalResult: Index value '"+index+"' not in range [0.."+(_ocorrenciasDepApurMensalResultList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) _ocorrenciasDepApurMensalResultList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult getOcorrenciasDepApurMensalResult(int) 

    /**
     * Method getOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @return OcorrenciasDepApurMensalResult
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult[] getOcorrenciasDepApurMensalResult()
    {
        int size = _ocorrenciasDepApurMensalResultList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) _ocorrenciasDepApurMensalResultList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult[] getOcorrenciasDepApurMensalResult() 

    /**
     * Method getOcorrenciasDepApurMensalResultCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasDepApurMensalResultCount()
    {
        return _ocorrenciasDepApurMensalResultList.size();
    } //-- int getOcorrenciasDepApurMensalResultCount() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Returns the value of field 'sinalApuracaoTotal'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotal'.
     */
    public java.lang.String getSinalApuracaoTotal()
    {
        return this._sinalApuracaoTotal;
    } //-- java.lang.String getSinalApuracaoTotal() 

    /**
     * Returns the value of field 'sinallApuracaoTotalG'.
     * 
     * @return String
     * @return the value of field 'sinallApuracaoTotalG'.
     */
    public java.lang.String getSinallApuracaoTotalG()
    {
        return this._sinallApuracaoTotalG;
    } //-- java.lang.String getSinallApuracaoTotalG() 

    /**
     * Returns the value of field 'sinallApuracaoTotalGer'.
     * 
     * @return String
     * @return the value of field 'sinallApuracaoTotalGer'.
     */
    public java.lang.String getSinallApuracaoTotalGer()
    {
        return this._sinallApuracaoTotalGer;
    } //-- java.lang.String getSinallApuracaoTotalGer() 

    /**
     * Returns the value of field 'sinallApuracaoTotalMun'.
     * 
     * @return String
     * @return the value of field 'sinallApuracaoTotalMun'.
     */
    public java.lang.String getSinallApuracaoTotalMun()
    {
        return this._sinallApuracaoTotalMun;
    } //-- java.lang.String getSinallApuracaoTotalMun() 

    /**
     * Returns the value of field 'valorApuracaoTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotal'.
     */
    public java.math.BigDecimal getValorApuracaoTotal()
    {
        return this._valorApuracaoTotal;
    } //-- java.math.BigDecimal getValorApuracaoTotal() 

    /**
     * Returns the value of field 'valorlApuracaoTotalG'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorlApuracaoTotalG'.
     */
    public java.math.BigDecimal getValorlApuracaoTotalG()
    {
        return this._valorlApuracaoTotalG;
    } //-- java.math.BigDecimal getValorlApuracaoTotalG() 

    /**
     * Returns the value of field 'valorlApuracaoTotalGer'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorlApuracaoTotalGer'.
     */
    public java.math.BigDecimal getValorlApuracaoTotalGer()
    {
        return this._valorlApuracaoTotalGer;
    } //-- java.math.BigDecimal getValorlApuracaoTotalGer() 

    /**
     * Returns the value of field 'valorlApuracaoTotalMun'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorlApuracaoTotalMun'.
     */
    public java.math.BigDecimal getValorlApuracaoTotalMun()
    {
        return this._valorlApuracaoTotalMun;
    } //-- java.math.BigDecimal getValorlApuracaoTotalMun() 

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
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Method removeAllOcorrenciasDepApurMensalResult
     * 
     */
    public void removeAllOcorrenciasDepApurMensalResult()
    {
        _ocorrenciasDepApurMensalResultList.removeAllElements();
    } //-- void removeAllOcorrenciasDepApurMensalResult() 

    /**
     * Method removeOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepApurMensalResult
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult removeOcorrenciasDepApurMensalResult(int index)
    {
        java.lang.Object obj = _ocorrenciasDepApurMensalResultList.elementAt(index);
        _ocorrenciasDepApurMensalResultList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult removeOcorrenciasDepApurMensalResult(int) 

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
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(java.lang.String codUF)
    {
        this._codUF = codUF;
    } //-- void setCodUF(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

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
     * Method setOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepApurMensalResult
     */
    public void setOcorrenciasDepApurMensalResult(int index, br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult vOcorrenciasDepApurMensalResult)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepApurMensalResultList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasDepApurMensalResult: Index value '"+index+"' not in range [0.." + (_ocorrenciasDepApurMensalResultList.size() - 1) + "]");
        }
        _ocorrenciasDepApurMensalResultList.setElementAt(vOcorrenciasDepApurMensalResult, index);
    } //-- void setOcorrenciasDepApurMensalResult(int, br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) 

    /**
     * Method setOcorrenciasDepApurMensalResult
     * 
     * 
     * 
     * @param ocorrenciasDepApurMensalResultArray
     */
    public void setOcorrenciasDepApurMensalResult(br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult[] ocorrenciasDepApurMensalResultArray)
    {
        //-- copy array
        _ocorrenciasDepApurMensalResultList.removeAllElements();
        for (int i = 0; i < ocorrenciasDepApurMensalResultArray.length; i++) {
            _ocorrenciasDepApurMensalResultList.addElement(ocorrenciasDepApurMensalResultArray[i]);
        }
    } //-- void setOcorrenciasDepApurMensalResult(br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.OcorrenciasDepApurMensalResult) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Sets the value of field 'sinalApuracaoTotal'.
     * 
     * @param sinalApuracaoTotal the value of field
     * 'sinalApuracaoTotal'.
     */
    public void setSinalApuracaoTotal(java.lang.String sinalApuracaoTotal)
    {
        this._sinalApuracaoTotal = sinalApuracaoTotal;
    } //-- void setSinalApuracaoTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinallApuracaoTotalG'.
     * 
     * @param sinallApuracaoTotalG the value of field
     * 'sinallApuracaoTotalG'.
     */
    public void setSinallApuracaoTotalG(java.lang.String sinallApuracaoTotalG)
    {
        this._sinallApuracaoTotalG = sinallApuracaoTotalG;
    } //-- void setSinallApuracaoTotalG(java.lang.String) 

    /**
     * Sets the value of field 'sinallApuracaoTotalGer'.
     * 
     * @param sinallApuracaoTotalGer the value of field
     * 'sinallApuracaoTotalGer'.
     */
    public void setSinallApuracaoTotalGer(java.lang.String sinallApuracaoTotalGer)
    {
        this._sinallApuracaoTotalGer = sinallApuracaoTotalGer;
    } //-- void setSinallApuracaoTotalGer(java.lang.String) 

    /**
     * Sets the value of field 'sinallApuracaoTotalMun'.
     * 
     * @param sinallApuracaoTotalMun the value of field
     * 'sinallApuracaoTotalMun'.
     */
    public void setSinallApuracaoTotalMun(java.lang.String sinallApuracaoTotalMun)
    {
        this._sinallApuracaoTotalMun = sinallApuracaoTotalMun;
    } //-- void setSinallApuracaoTotalMun(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracaoTotal'.
     * 
     * @param valorApuracaoTotal the value of field
     * 'valorApuracaoTotal'.
     */
    public void setValorApuracaoTotal(java.math.BigDecimal valorApuracaoTotal)
    {
        this._valorApuracaoTotal = valorApuracaoTotal;
    } //-- void setValorApuracaoTotal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorlApuracaoTotalG'.
     * 
     * @param valorlApuracaoTotalG the value of field
     * 'valorlApuracaoTotalG'.
     */
    public void setValorlApuracaoTotalG(java.math.BigDecimal valorlApuracaoTotalG)
    {
        this._valorlApuracaoTotalG = valorlApuracaoTotalG;
    } //-- void setValorlApuracaoTotalG(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorlApuracaoTotalGer'.
     * 
     * @param valorlApuracaoTotalGer the value of field
     * 'valorlApuracaoTotalGer'.
     */
    public void setValorlApuracaoTotalGer(java.math.BigDecimal valorlApuracaoTotalGer)
    {
        this._valorlApuracaoTotalGer = valorlApuracaoTotalGer;
    } //-- void setValorlApuracaoTotalGer(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorlApuracaoTotalMun'.
     * 
     * @param valorlApuracaoTotalMun the value of field
     * 'valorlApuracaoTotalMun'.
     */
    public void setValorlApuracaoTotalMun(java.math.BigDecimal valorlApuracaoTotalMun)
    {
        this._valorlApuracaoTotalMun = valorlApuracaoTotalMun;
    } //-- void setValorlApuracaoTotalMun(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDepApurMensalResulPesqResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.response.ListarDepApurMensalResulPesqResponse unmarshal(java.io.Reader) 

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
