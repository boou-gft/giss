/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboEstadoRequest.java,v 1.2 2017/12/18 11:45:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request;

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
 * Class ListarComboEstadoRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/18 11:45:59 $
 */
public class ListarComboEstadoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeReg
     */
    private int _qtdeReg = 0;

    /**
     * keeps track of state for field: _qtdeReg
     */
    private boolean _has_qtdeReg;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboEstadoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteQtdeReg
     * 
     */
    public void deleteQtdeReg()
    {
        this._has_qtdeReg= false;
    } //-- void deleteQtdeReg() 

    /**
     * Returns the value of field 'qtdeReg'.
     * 
     * @return int
     * @return the value of field 'qtdeReg'.
     */
    public int getQtdeReg()
    {
        return this._qtdeReg;
    } //-- int getQtdeReg() 

    /**
     * Method hasQtdeReg
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeReg()
    {
        return this._has_qtdeReg;
    } //-- boolean hasQtdeReg() 

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
     * Sets the value of field 'qtdeReg'.
     * 
     * @param qtdeReg the value of field 'qtdeReg'.
     */
    public void setQtdeReg(int qtdeReg)
    {
        this._qtdeReg = qtdeReg;
        this._has_qtdeReg = true;
    } //-- void setQtdeReg(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboEstadoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.request.ListarComboEstadoRequest unmarshal(java.io.Reader) 

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
