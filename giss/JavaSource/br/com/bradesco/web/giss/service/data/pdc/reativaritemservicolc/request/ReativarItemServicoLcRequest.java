/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request;

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
 * Class ReativarItemServicoLcRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ReativarItemServicoLcRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLeiCompl
     */
    private int _codItemLeiCompl = 0;

    /**
     * keeps track of state for field: _codItemLeiCompl
     */
    private boolean _has_codItemLeiCompl;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReativarItemServicoLcRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLeiCompl
     * 
     */
    public void deleteCodItemLeiCompl()
    {
        this._has_codItemLeiCompl= false;
    } //-- void deleteCodItemLeiCompl() 

    /**
     * Returns the value of field 'codItemLeiCompl'.
     * 
     * @return int
     * @return the value of field 'codItemLeiCompl'.
     */
    public int getCodItemLeiCompl()
    {
        return this._codItemLeiCompl;
    } //-- int getCodItemLeiCompl() 

    /**
     * Method hasCodItemLeiCompl
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLeiCompl()
    {
        return this._has_codItemLeiCompl;
    } //-- boolean hasCodItemLeiCompl() 

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
     * Sets the value of field 'codItemLeiCompl'.
     * 
     * @param codItemLeiCompl the value of field 'codItemLeiCompl'.
     */
    public void setCodItemLeiCompl(int codItemLeiCompl)
    {
        this._codItemLeiCompl = codItemLeiCompl;
        this._has_codItemLeiCompl = true;
    } //-- void setCodItemLeiCompl(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ReativarItemServicoLcRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.request.ReativarItemServicoLcRequest unmarshal(java.io.Reader) 

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
