/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoMensalReprocessamentoRequest.java,v 1.1 2017/04/11 14:12:21 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request;

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
 * Class ListarApuracaoMensalReprocessamentoRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:21 $
 */
public class ListarApuracaoMensalReprocessamentoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxOcorrencia
     */
    private int _maxOcorrencia = 0;

    /**
     * keeps track of state for field: _maxOcorrencia
     */
    private boolean _has_maxOcorrencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoMensalReprocessamentoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteMaxOcorrencia
     * 
     */
    public void deleteMaxOcorrencia()
    {
        this._has_maxOcorrencia= false;
    } //-- void deleteMaxOcorrencia() 

    /**
     * Returns the value of field 'maxOcorrencia'.
     * 
     * @return int
     * @return the value of field 'maxOcorrencia'.
     */
    public int getMaxOcorrencia()
    {
        return this._maxOcorrencia;
    } //-- int getMaxOcorrencia() 

    /**
     * Method hasMaxOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMaxOcorrencia()
    {
        return this._has_maxOcorrencia;
    } //-- boolean hasMaxOcorrencia() 

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
     * Sets the value of field 'maxOcorrencia'.
     * 
     * @param maxOcorrencia the value of field 'maxOcorrencia'.
     */
    public void setMaxOcorrencia(int maxOcorrencia)
    {
        this._maxOcorrencia = maxOcorrencia;
        this._has_maxOcorrencia = true;
    } //-- void setMaxOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoMensalReprocessamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.request.ListarApuracaoMensalReprocessamentoRequest unmarshal(java.io.Reader) 

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
