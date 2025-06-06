/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Motivo.java,v 1.1 2017/04/11 14:10:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response;

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
 * Class Motivo.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:17 $
 */
public class Motivo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalMotivo
     */
    private java.lang.String _sinalMotivo;

    /**
     * Field _valorMotivo
     */
    private double _valorMotivo = 0;

    /**
     * keeps track of state for field: _valorMotivo
     */
    private boolean _has_valorMotivo;


      //----------------/
     //- Constructors -/
    //----------------/

    public Motivo() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorMotivo
     * 
     */
    public void deleteValorMotivo()
    {
        this._has_valorMotivo= false;
    } //-- void deleteValorMotivo() 

    /**
     * Returns the value of field 'sinalMotivo'.
     * 
     * @return String
     * @return the value of field 'sinalMotivo'.
     */
    public java.lang.String getSinalMotivo()
    {
        return this._sinalMotivo;
    } //-- java.lang.String getSinalMotivo() 

    /**
     * Returns the value of field 'valorMotivo'.
     * 
     * @return double
     * @return the value of field 'valorMotivo'.
     */
    public double getValorMotivo()
    {
        return this._valorMotivo;
    } //-- double getValorMotivo() 

    /**
     * Method hasValorMotivo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorMotivo()
    {
        return this._has_valorMotivo;
    } //-- boolean hasValorMotivo() 

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
     * Sets the value of field 'sinalMotivo'.
     * 
     * @param sinalMotivo the value of field 'sinalMotivo'.
     */
    public void setSinalMotivo(java.lang.String sinalMotivo)
    {
        this._sinalMotivo = sinalMotivo;
    } //-- void setSinalMotivo(java.lang.String) 

    /**
     * Sets the value of field 'valorMotivo'.
     * 
     * @param valorMotivo the value of field 'valorMotivo'.
     */
    public void setValorMotivo(double valorMotivo)
    {
        this._valorMotivo = valorMotivo;
        this._has_valorMotivo = true;
    } //-- void setValorMotivo(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Motivo
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Motivo unmarshal(java.io.Reader) 

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
