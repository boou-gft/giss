/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ValorISS.java,v 1.1 2017/04/11 14:08:55 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response;

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
 * Class ValorISS.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:55 $
 */
public class ValorISS implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalValorISS
     */
    private java.lang.String _sinalValorISS;

    /**
     * Field _valorValorISS
     */
    private double _valorValorISS = 0;

    /**
     * keeps track of state for field: _valorValorISS
     */
    private boolean _has_valorValorISS;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValorISS() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISS()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorValorISS
     * 
     */
    public void deleteValorValorISS()
    {
        this._has_valorValorISS= false;
    } //-- void deleteValorValorISS() 

    /**
     * Returns the value of field 'sinalValorISS'.
     * 
     * @return String
     * @return the value of field 'sinalValorISS'.
     */
    public java.lang.String getSinalValorISS()
    {
        return this._sinalValorISS;
    } //-- java.lang.String getSinalValorISS() 

    /**
     * Returns the value of field 'valorValorISS'.
     * 
     * @return double
     * @return the value of field 'valorValorISS'.
     */
    public double getValorValorISS()
    {
        return this._valorValorISS;
    } //-- double getValorValorISS() 

    /**
     * Method hasValorValorISS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorValorISS()
    {
        return this._has_valorValorISS;
    } //-- boolean hasValorValorISS() 

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
     * Sets the value of field 'sinalValorISS'.
     * 
     * @param sinalValorISS the value of field 'sinalValorISS'.
     */
    public void setSinalValorISS(java.lang.String sinalValorISS)
    {
        this._sinalValorISS = sinalValorISS;
    } //-- void setSinalValorISS(java.lang.String) 

    /**
     * Sets the value of field 'valorValorISS'.
     * 
     * @param valorValorISS the value of field 'valorValorISS'.
     */
    public void setValorValorISS(double valorValorISS)
    {
        this._valorValorISS = valorValorISS;
        this._has_valorValorISS = true;
    } //-- void setValorValorISS(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ValorISS
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISS unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISS) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISS.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISS unmarshal(java.io.Reader) 

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
