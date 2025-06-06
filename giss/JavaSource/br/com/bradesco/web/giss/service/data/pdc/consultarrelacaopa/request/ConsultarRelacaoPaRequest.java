/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarRelacaoPaRequest.java,v 1.2 2017/09/11 13:29:48 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ConsultarRelacaoPaRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/09/11 13:29:48 $
 */
public class ConsultarRelacaoPaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdOcorrencia
     */
    private int _qtdOcorrencia = 0;

    /**
     * keeps track of state for field: _qtdOcorrencia
     */
    private boolean _has_qtdOcorrencia;

    /**
     * Field _codigoMunicipioPa
     */
    private long _codigoMunicipioPa = 0;

    /**
     * keeps track of state for field: _codigoMunicipioPa
     */
    private boolean _has_codigoMunicipioPa;

    /**
     * Field _codigoUfPa
     */
    private int _codigoUfPa = 0;

    /**
     * keeps track of state for field: _codigoUfPa
     */
    private boolean _has_codigoUfPa;

    /**
     * Field _todosPas
     */
    private int _todosPas = 0;

    /**
     * keeps track of state for field: _todosPas
     */
    private boolean _has_todosPas;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarRelacaoPaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipioPa
     * 
     */
    public void deleteCodigoMunicipioPa()
    {
        this._has_codigoMunicipioPa= false;
    } //-- void deleteCodigoMunicipioPa() 

    /**
     * Method deleteCodigoUfPa
     * 
     */
    public void deleteCodigoUfPa()
    {
        this._has_codigoUfPa= false;
    } //-- void deleteCodigoUfPa() 

    /**
     * Method deleteQtdOcorrencia
     * 
     */
    public void deleteQtdOcorrencia()
    {
        this._has_qtdOcorrencia= false;
    } //-- void deleteQtdOcorrencia() 

    /**
     * Method deleteTodosPas
     * 
     */
    public void deleteTodosPas()
    {
        this._has_todosPas= false;
    } //-- void deleteTodosPas() 

    /**
     * Returns the value of field 'codigoMunicipioPa'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipioPa'.
     */
    public long getCodigoMunicipioPa()
    {
        return this._codigoMunicipioPa;
    } //-- long getCodigoMunicipioPa() 

    /**
     * Returns the value of field 'codigoUfPa'.
     * 
     * @return int
     * @return the value of field 'codigoUfPa'.
     */
    public int getCodigoUfPa()
    {
        return this._codigoUfPa;
    } //-- int getCodigoUfPa() 

    /**
     * Returns the value of field 'qtdOcorrencia'.
     * 
     * @return int
     * @return the value of field 'qtdOcorrencia'.
     */
    public int getQtdOcorrencia()
    {
        return this._qtdOcorrencia;
    } //-- int getQtdOcorrencia() 

    /**
     * Returns the value of field 'todosPas'.
     * 
     * @return int
     * @return the value of field 'todosPas'.
     */
    public int getTodosPas()
    {
        return this._todosPas;
    } //-- int getTodosPas() 

    /**
     * Method hasCodigoMunicipioPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipioPa()
    {
        return this._has_codigoMunicipioPa;
    } //-- boolean hasCodigoMunicipioPa() 

    /**
     * Method hasCodigoUfPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUfPa()
    {
        return this._has_codigoUfPa;
    } //-- boolean hasCodigoUfPa() 

    /**
     * Method hasQtdOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdOcorrencia()
    {
        return this._has_qtdOcorrencia;
    } //-- boolean hasQtdOcorrencia() 

    /**
     * Method hasTodosPas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTodosPas()
    {
        return this._has_todosPas;
    } //-- boolean hasTodosPas() 

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
     * Sets the value of field 'codigoMunicipioPa'.
     * 
     * @param codigoMunicipioPa the value of field
     * 'codigoMunicipioPa'.
     */
    public void setCodigoMunicipioPa(long codigoMunicipioPa)
    {
        this._codigoMunicipioPa = codigoMunicipioPa;
        this._has_codigoMunicipioPa = true;
    } //-- void setCodigoMunicipioPa(long) 

    /**
     * Sets the value of field 'codigoUfPa'.
     * 
     * @param codigoUfPa the value of field 'codigoUfPa'.
     */
    public void setCodigoUfPa(int codigoUfPa)
    {
        this._codigoUfPa = codigoUfPa;
        this._has_codigoUfPa = true;
    } //-- void setCodigoUfPa(int) 

    /**
     * Sets the value of field 'qtdOcorrencia'.
     * 
     * @param qtdOcorrencia the value of field 'qtdOcorrencia'.
     */
    public void setQtdOcorrencia(int qtdOcorrencia)
    {
        this._qtdOcorrencia = qtdOcorrencia;
        this._has_qtdOcorrencia = true;
    } //-- void setQtdOcorrencia(int) 

    /**
     * Sets the value of field 'todosPas'.
     * 
     * @param todosPas the value of field 'todosPas'.
     */
    public void setTodosPas(int todosPas)
    {
        this._todosPas = todosPas;
        this._has_todosPas = true;
    } //-- void setTodosPas(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarRelacaoPaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.request.ConsultarRelacaoPaRequest unmarshal(java.io.Reader) 

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
