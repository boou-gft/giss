/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request;

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
 * Class ExcluirPercentualTransicaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ExcluirPercentualTransicaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numParmDistrIss
     */
    private int _numParmDistrIss = 0;

    /**
     * keeps track of state for field: _numParmDistrIss
     */
    private boolean _has_numParmDistrIss;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirPercentualTransicaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumParmDistrIss
     * 
     */
    public void deleteNumParmDistrIss()
    {
        this._has_numParmDistrIss= false;
    } //-- void deleteNumParmDistrIss() 

    /**
     * Returns the value of field 'numParmDistrIss'.
     * 
     * @return int
     * @return the value of field 'numParmDistrIss'.
     */
    public int getNumParmDistrIss()
    {
        return this._numParmDistrIss;
    } //-- int getNumParmDistrIss() 

    /**
     * Method hasNumParmDistrIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumParmDistrIss()
    {
        return this._has_numParmDistrIss;
    } //-- boolean hasNumParmDistrIss() 

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
     * Sets the value of field 'numParmDistrIss'.
     * 
     * @param numParmDistrIss the value of field 'numParmDistrIss'.
     */
    public void setNumParmDistrIss(int numParmDistrIss)
    {
        this._numParmDistrIss = numParmDistrIss;
        this._has_numParmDistrIss = true;
    } //-- void setNumParmDistrIss(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirPercentualTransicaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.request.ExcluirPercentualTransicaoRequest unmarshal(java.io.Reader) 

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
