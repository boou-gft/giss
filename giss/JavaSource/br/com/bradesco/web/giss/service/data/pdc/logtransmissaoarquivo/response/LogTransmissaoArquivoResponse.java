/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response;

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
 * Class LogTransmissaoArquivoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class LogTransmissaoArquivoResponse implements java.io.Serializable {


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
     * Field _sNumConsultas
     */
    private int _sNumConsultas = 0;

    /**
     * keeps track of state for field: _sNumConsultas
     */
    private boolean _has_sNumConsultas;

    /**
     * Field _GISSW06SREGSAIDAList
     */
    private java.util.Vector _GISSW06SREGSAIDAList;


      //----------------/
     //- Constructors -/
    //----------------/

    public LogTransmissaoArquivoResponse() 
     {
        super();
        _GISSW06SREGSAIDAList = new Vector();
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param vGISSW06SREGSAIDA
     */
    public void addGISSW06SREGSAIDA(br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA vGISSW06SREGSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_GISSW06SREGSAIDAList.size() < 50)) {
            throw new IndexOutOfBoundsException("addGISSW06SREGSAIDA has a maximum of 50");
        }
        _GISSW06SREGSAIDAList.addElement(vGISSW06SREGSAIDA);
    } //-- void addGISSW06SREGSAIDA(br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) 

    /**
     * Method addGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param index
     * @param vGISSW06SREGSAIDA
     */
    public void addGISSW06SREGSAIDA(int index, br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA vGISSW06SREGSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_GISSW06SREGSAIDAList.size() < 50)) {
            throw new IndexOutOfBoundsException("addGISSW06SREGSAIDA has a maximum of 50");
        }
        _GISSW06SREGSAIDAList.insertElementAt(vGISSW06SREGSAIDA, index);
    } //-- void addGISSW06SREGSAIDA(int, br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) 

    /**
     * Method deleteSNumConsultas
     * 
     */
    public void deleteSNumConsultas()
    {
        this._has_sNumConsultas= false;
    } //-- void deleteSNumConsultas() 

    /**
     * Method enumerateGISSW06SREGSAIDA
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateGISSW06SREGSAIDA()
    {
        return _GISSW06SREGSAIDAList.elements();
    } //-- java.util.Enumeration enumerateGISSW06SREGSAIDA() 

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
     * Method getGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param index
     * @return GISSW06SREGSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA getGISSW06SREGSAIDA(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _GISSW06SREGSAIDAList.size())) {
            throw new IndexOutOfBoundsException("getGISSW06SREGSAIDA: Index value '"+index+"' not in range [0.."+(_GISSW06SREGSAIDAList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) _GISSW06SREGSAIDAList.elementAt(index);
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA getGISSW06SREGSAIDA(int) 

    /**
     * Method getGISSW06SREGSAIDA
     * 
     * 
     * 
     * @return GISSW06SREGSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA[] getGISSW06SREGSAIDA()
    {
        int size = _GISSW06SREGSAIDAList.size();
        br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA[] mArray = new br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) _GISSW06SREGSAIDAList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA[] getGISSW06SREGSAIDA() 

    /**
     * Method getGISSW06SREGSAIDACount
     * 
     * 
     * 
     * @return int
     */
    public int getGISSW06SREGSAIDACount()
    {
        return _GISSW06SREGSAIDAList.size();
    } //-- int getGISSW06SREGSAIDACount() 

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
     * Returns the value of field 'sNumConsultas'.
     * 
     * @return int
     * @return the value of field 'sNumConsultas'.
     */
    public int getSNumConsultas()
    {
        return this._sNumConsultas;
    } //-- int getSNumConsultas() 

    /**
     * Method hasSNumConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSNumConsultas()
    {
        return this._has_sNumConsultas;
    } //-- boolean hasSNumConsultas() 

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
     * Method removeAllGISSW06SREGSAIDA
     * 
     */
    public void removeAllGISSW06SREGSAIDA()
    {
        _GISSW06SREGSAIDAList.removeAllElements();
    } //-- void removeAllGISSW06SREGSAIDA() 

    /**
     * Method removeGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param index
     * @return GISSW06SREGSAIDA
     */
    public br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA removeGISSW06SREGSAIDA(int index)
    {
        java.lang.Object obj = _GISSW06SREGSAIDAList.elementAt(index);
        _GISSW06SREGSAIDAList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) obj;
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA removeGISSW06SREGSAIDA(int) 

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
     * Method setGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param index
     * @param vGISSW06SREGSAIDA
     */
    public void setGISSW06SREGSAIDA(int index, br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA vGISSW06SREGSAIDA)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _GISSW06SREGSAIDAList.size())) {
            throw new IndexOutOfBoundsException("setGISSW06SREGSAIDA: Index value '"+index+"' not in range [0.." + (_GISSW06SREGSAIDAList.size() - 1) + "]");
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException("setGISSW06SREGSAIDA has a maximum of 50");
        }
        _GISSW06SREGSAIDAList.setElementAt(vGISSW06SREGSAIDA, index);
    } //-- void setGISSW06SREGSAIDA(int, br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) 

    /**
     * Method setGISSW06SREGSAIDA
     * 
     * 
     * 
     * @param GISSW06SREGSAIDAArray
     */
    public void setGISSW06SREGSAIDA(br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA[] GISSW06SREGSAIDAArray)
    {
        //-- copy array
        _GISSW06SREGSAIDAList.removeAllElements();
        for (int i = 0; i < GISSW06SREGSAIDAArray.length; i++) {
            _GISSW06SREGSAIDAList.addElement(GISSW06SREGSAIDAArray[i]);
        }
    } //-- void setGISSW06SREGSAIDA(br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.GISSW06SREGSAIDA) 

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
     * Sets the value of field 'sNumConsultas'.
     * 
     * @param sNumConsultas the value of field 'sNumConsultas'.
     */
    public void setSNumConsultas(int sNumConsultas)
    {
        this._sNumConsultas = sNumConsultas;
        this._has_sNumConsultas = true;
    } //-- void setSNumConsultas(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return LogTransmissaoArquivoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.logtransmissaoarquivo.response.LogTransmissaoArquivoResponse unmarshal(java.io.Reader) 

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
