/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request;

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
 * Class SolicitarRemessaAliquotaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class SolicitarRemessaAliquotaRequest implements java.io.Serializable {


      //----------------/
     //- Constructors -/
    //----------------/

    public SolicitarRemessaAliquotaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SolicitarRemessaAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.request.SolicitarRemessaAliquotaRequest unmarshal(java.io.Reader) 

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
