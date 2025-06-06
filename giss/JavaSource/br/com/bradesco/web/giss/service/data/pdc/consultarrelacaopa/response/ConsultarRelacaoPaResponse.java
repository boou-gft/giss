/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarRelacaoPaResponse.java,v 1.2 2017/09/11 13:29:49 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response;

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
 * Class ConsultarRelacaoPaResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/09/11 13:29:49 $
 */
public class ConsultarRelacaoPaResponse implements java.io.Serializable {


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
     * Field _numeroOcorrencias
     */
    private int _numeroOcorrencias = 0;

    /**
     * keeps track of state for field: _numeroOcorrencias
     */
    private boolean _has_numeroOcorrencias;

    /**
     * Field _ocorrenciaList
     */
    private java.util.Vector _ocorrenciaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarRelacaoPaResponse() 
     {
        super();
        _ocorrenciaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencia
     * 
     * 
     * 
     * @param vOcorrencia
     */
    public void addOcorrencia(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciaList.size() < 120)) {
            throw new IndexOutOfBoundsException("addOcorrencia has a maximum of 120");
        }
        _ocorrenciaList.addElement(vOcorrencia);
    } //-- void addOcorrencia(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) 

    /**
     * Method addOcorrencia
     * 
     * 
     * 
     * @param index
     * @param vOcorrencia
     */
    public void addOcorrencia(int index, br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciaList.size() < 120)) {
            throw new IndexOutOfBoundsException("addOcorrencia has a maximum of 120");
        }
        _ocorrenciaList.insertElementAt(vOcorrencia, index);
    } //-- void addOcorrencia(int, br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) 

    /**
     * Method deleteNumeroOcorrencias
     * 
     */
    public void deleteNumeroOcorrencias()
    {
        this._has_numeroOcorrencias= false;
    } //-- void deleteNumeroOcorrencias() 

    /**
     * Method enumerateOcorrencia
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencia()
    {
        return _ocorrenciaList.elements();
    } //-- java.util.Enumeration enumerateOcorrencia() 

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
     * Returns the value of field 'numeroOcorrencias'.
     * 
     * @return int
     * @return the value of field 'numeroOcorrencias'.
     */
    public int getNumeroOcorrencias()
    {
        return this._numeroOcorrencias;
    } //-- int getNumeroOcorrencias() 

    /**
     * Method getOcorrencia
     * 
     * 
     * 
     * @param index
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia getOcorrencia(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencia: Index value '"+index+"' not in range [0.."+(_ocorrenciaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) _ocorrenciaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia getOcorrencia(int) 

    /**
     * Method getOcorrencia
     * 
     * 
     * 
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia[] getOcorrencia()
    {
        int size = _ocorrenciaList.size();
        br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia[] mArray = new br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) _ocorrenciaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia[] getOcorrencia() 

    /**
     * Method getOcorrenciaCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciaCount()
    {
        return _ocorrenciaList.size();
    } //-- int getOcorrenciaCount() 

    /**
     * Method hasNumeroOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroOcorrencias()
    {
        return this._has_numeroOcorrencias;
    } //-- boolean hasNumeroOcorrencias() 

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
     * Method removeAllOcorrencia
     * 
     */
    public void removeAllOcorrencia()
    {
        _ocorrenciaList.removeAllElements();
    } //-- void removeAllOcorrencia() 

    /**
     * Method removeOcorrencia
     * 
     * 
     * 
     * @param index
     * @return Ocorrencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia removeOcorrencia(int index)
    {
        java.lang.Object obj = _ocorrenciaList.elementAt(index);
        _ocorrenciaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia removeOcorrencia(int) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numeroOcorrencias'.
     * 
     * @param numeroOcorrencias the value of field
     * 'numeroOcorrencias'.
     */
    public void setNumeroOcorrencias(int numeroOcorrencias)
    {
        this._numeroOcorrencias = numeroOcorrencias;
        this._has_numeroOcorrencias = true;
    } //-- void setNumeroOcorrencias(int) 

    /**
     * Method setOcorrencia
     * 
     * 
     * 
     * @param index
     * @param vOcorrencia
     */
    public void setOcorrencia(int index, br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia vOcorrencia)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciaList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencia: Index value '"+index+"' not in range [0.." + (_ocorrenciaList.size() - 1) + "]");
        }
        if (!(index < 120)) {
            throw new IndexOutOfBoundsException("setOcorrencia has a maximum of 120");
        }
        _ocorrenciaList.setElementAt(vOcorrencia, index);
    } //-- void setOcorrencia(int, br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) 

    /**
     * Method setOcorrencia
     * 
     * 
     * 
     * @param ocorrenciaArray
     */
    public void setOcorrencia(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia[] ocorrenciaArray)
    {
        //-- copy array
        _ocorrenciaList.removeAllElements();
        for (int i = 0; i < ocorrenciaArray.length; i++) {
            _ocorrenciaList.addElement(ocorrenciaArray[i]);
        }
    } //-- void setOcorrencia(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.Ocorrencia) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarRelacaoPaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.response.ConsultarRelacaoPaResponse unmarshal(java.io.Reader) 

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
