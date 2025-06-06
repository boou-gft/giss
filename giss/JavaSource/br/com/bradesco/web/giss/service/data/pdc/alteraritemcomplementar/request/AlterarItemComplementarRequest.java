/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AlterarItemComplementarRequest.java,v 1.1 2017/11/09 16:45:31 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request;

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
 * Class AlterarItemComplementarRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/11/09 16:45:31 $
 */
public class AlterarItemComplementarRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLC
     */
    private long _codItemLC = 0;

    /**
     * keeps track of state for field: _codItemLC
     */
    private boolean _has_codItemLC;

    /**
     * Field _descItemLC
     */
    private java.lang.String _descItemLC;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarItemComplementarRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLC
     * 
     */
    public void deleteCodItemLC()
    {
        this._has_codItemLC= false;
    } //-- void deleteCodItemLC() 

    /**
     * Returns the value of field 'codItemLC'.
     * 
     * @return long
     * @return the value of field 'codItemLC'.
     */
    public long getCodItemLC()
    {
        return this._codItemLC;
    } //-- long getCodItemLC() 

    /**
     * Returns the value of field 'descItemLC'.
     * 
     * @return String
     * @return the value of field 'descItemLC'.
     */
    public java.lang.String getDescItemLC()
    {
        return this._descItemLC;
    } //-- java.lang.String getDescItemLC() 

    /**
     * Method hasCodItemLC
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLC()
    {
        return this._has_codItemLC;
    } //-- boolean hasCodItemLC() 

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
     * Sets the value of field 'codItemLC'.
     * 
     * @param codItemLC the value of field 'codItemLC'.
     */
    public void setCodItemLC(long codItemLC)
    {
        this._codItemLC = codItemLC;
        this._has_codItemLC = true;
    } //-- void setCodItemLC(long) 

    /**
     * Sets the value of field 'descItemLC'.
     * 
     * @param descItemLC the value of field 'descItemLC'.
     */
    public void setDescItemLC(java.lang.String descItemLC)
    {
        this._descItemLC = descItemLC;
    } //-- void setDescItemLC(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlterarItemComplementarRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.request.AlterarItemComplementarRequest unmarshal(java.io.Reader) 

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
