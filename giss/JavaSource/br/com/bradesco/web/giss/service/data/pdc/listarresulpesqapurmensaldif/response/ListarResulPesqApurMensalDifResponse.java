/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarResulPesqApurMensalDifResponse.java,v 1.1 2017/04/11 14:11:46 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarResulPesqApurMensalDifResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:46 $
 */
public class ListarResulPesqApurMensalDifResponse implements java.io.Serializable {
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
     * Field _sinalApuracaoTotalM
     */
    private java.lang.String _sinalApuracaoTotalM;

    /**
     * Field _valorApuracaoTotalM
     */
    private java.math.BigDecimal _valorApuracaoTotalM = new java.math.BigDecimal("0");

    /**
     * Field _sinalApuracaoTotalMun
     */
    private java.lang.String _sinalApuracaoTotalMun;

    /**
     * Field _valorApuracaoTotalMun
     */
    private java.math.BigDecimal _valorApuracaoTotalMun = new java.math.BigDecimal("0");

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _ocorrenciasResultPesqApurMesDifList
     */
    private java.util.Vector<Object> _ocorrenciasResultPesqApurMesDifList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarResulPesqApurMensalDifResponse() 
     {
        super();
        setValorApuracaoTotalM(new java.math.BigDecimal("0"));
        setValorApuracaoTotalMun(new java.math.BigDecimal("0"));
        _ocorrenciasResultPesqApurMesDifList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param vOcorrenciasResultPesqApurMesDif
     */
    public void addOcorrenciasResultPesqApurMesDif(br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif vOcorrenciasResultPesqApurMesDif)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasResultPesqApurMesDifList.addElement(vOcorrenciasResultPesqApurMesDif);
    } //-- void addOcorrenciasResultPesqApurMesDif(br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) 

    /**
     * Method addOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasResultPesqApurMesDif
     */
    public void addOcorrenciasResultPesqApurMesDif(int index, br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif vOcorrenciasResultPesqApurMesDif)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasResultPesqApurMesDifList.insertElementAt(vOcorrenciasResultPesqApurMesDif, index);
    } //-- void addOcorrenciasResultPesqApurMesDif(int, br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) 

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
     * Method enumerateOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasResultPesqApurMesDif()
    {
        return _ocorrenciasResultPesqApurMesDifList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasResultPesqApurMesDif() 

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
     * Method getOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasResultPesqApurMesDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif getOcorrenciasResultPesqApurMesDif(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasResultPesqApurMesDifList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasResultPesqApurMesDif: Index value '"+index+"' not in range [0.."+(_ocorrenciasResultPesqApurMesDifList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) _ocorrenciasResultPesqApurMesDifList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif getOcorrenciasResultPesqApurMesDif(int) 

    /**
     * Method getOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @return OcorrenciasResultPesqApurMesDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif[] getOcorrenciasResultPesqApurMesDif()
    {
        int size = _ocorrenciasResultPesqApurMesDifList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) _ocorrenciasResultPesqApurMesDifList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif[] getOcorrenciasResultPesqApurMesDif() 

    /**
     * Method getOcorrenciasResultPesqApurMesDifCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasResultPesqApurMesDifCount()
    {
        return _ocorrenciasResultPesqApurMesDifList.size();
    } //-- int getOcorrenciasResultPesqApurMesDifCount() 

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
     * Returns the value of field 'sinalApuracaoTotalM'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalM'.
     */
    public java.lang.String getSinalApuracaoTotalM()
    {
        return this._sinalApuracaoTotalM;
    } //-- java.lang.String getSinalApuracaoTotalM() 

    /**
     * Returns the value of field 'sinalApuracaoTotalMun'.
     * 
     * @return String
     * @return the value of field 'sinalApuracaoTotalMun'.
     */
    public java.lang.String getSinalApuracaoTotalMun()
    {
        return this._sinalApuracaoTotalMun;
    } //-- java.lang.String getSinalApuracaoTotalMun() 

    /**
     * Returns the value of field 'valorApuracaoTotalM'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalM'.
     */
    public java.math.BigDecimal getValorApuracaoTotalM()
    {
        return this._valorApuracaoTotalM;
    } //-- java.math.BigDecimal getValorApuracaoTotalM() 

    /**
     * Returns the value of field 'valorApuracaoTotalMun'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracaoTotalMun'.
     */
    public java.math.BigDecimal getValorApuracaoTotalMun()
    {
        return this._valorApuracaoTotalMun;
    } //-- java.math.BigDecimal getValorApuracaoTotalMun() 

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
     * Method removeAllOcorrenciasResultPesqApurMesDif
     * 
     */
    public void removeAllOcorrenciasResultPesqApurMesDif()
    {
        _ocorrenciasResultPesqApurMesDifList.removeAllElements();
    } //-- void removeAllOcorrenciasResultPesqApurMesDif() 

    /**
     * Method removeOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasResultPesqApurMesDif
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif removeOcorrenciasResultPesqApurMesDif(int index)
    {
        java.lang.Object obj = _ocorrenciasResultPesqApurMesDifList.elementAt(index);
        _ocorrenciasResultPesqApurMesDifList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif removeOcorrenciasResultPesqApurMesDif(int) 

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
     * Method setOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasResultPesqApurMesDif
     */
    public void setOcorrenciasResultPesqApurMesDif(int index, br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif vOcorrenciasResultPesqApurMesDif)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasResultPesqApurMesDifList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasResultPesqApurMesDif: Index value '"+index+"' not in range [0.." + (_ocorrenciasResultPesqApurMesDifList.size() - 1) + "]");
        }
        _ocorrenciasResultPesqApurMesDifList.setElementAt(vOcorrenciasResultPesqApurMesDif, index);
    } //-- void setOcorrenciasResultPesqApurMesDif(int, br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) 

    /**
     * Method setOcorrenciasResultPesqApurMesDif
     * 
     * 
     * 
     * @param ocorrenciasResultPesqApurMesDifArray
     */
    public void setOcorrenciasResultPesqApurMesDif(br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif[] ocorrenciasResultPesqApurMesDifArray)
    {
        //-- copy array
        _ocorrenciasResultPesqApurMesDifList.removeAllElements();
        for (int i = 0; i < ocorrenciasResultPesqApurMesDifArray.length; i++) {
            _ocorrenciasResultPesqApurMesDifList.addElement(ocorrenciasResultPesqApurMesDifArray[i]);
        }
    } //-- void setOcorrenciasResultPesqApurMesDif(br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.OcorrenciasResultPesqApurMesDif) 

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
     * Sets the value of field 'sinalApuracaoTotalM'.
     * 
     * @param sinalApuracaoTotalM the value of field
     * 'sinalApuracaoTotalM'.
     */
    public void setSinalApuracaoTotalM(java.lang.String sinalApuracaoTotalM)
    {
        this._sinalApuracaoTotalM = sinalApuracaoTotalM;
    } //-- void setSinalApuracaoTotalM(java.lang.String) 

    /**
     * Sets the value of field 'sinalApuracaoTotalMun'.
     * 
     * @param sinalApuracaoTotalMun the value of field
     * 'sinalApuracaoTotalMun'.
     */
    public void setSinalApuracaoTotalMun(java.lang.String sinalApuracaoTotalMun)
    {
        this._sinalApuracaoTotalMun = sinalApuracaoTotalMun;
    } //-- void setSinalApuracaoTotalMun(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracaoTotalM'.
     * 
     * @param valorApuracaoTotalM the value of field
     * 'valorApuracaoTotalM'.
     */
    public void setValorApuracaoTotalM(java.math.BigDecimal valorApuracaoTotalM)
    {
        this._valorApuracaoTotalM = valorApuracaoTotalM;
    } //-- void setValorApuracaoTotalM(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorApuracaoTotalMun'.
     * 
     * @param valorApuracaoTotalMun the value of field
     * 'valorApuracaoTotalMun'.
     */
    public void setValorApuracaoTotalMun(java.math.BigDecimal valorApuracaoTotalMun)
    {
        this._valorApuracaoTotalMun = valorApuracaoTotalMun;
    } //-- void setValorApuracaoTotalMun(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarResulPesqApurMensalDifResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.response.ListarResulPesqApurMensalDifResponse unmarshal(java.io.Reader) 

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
