/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class DetalharCargaMassivaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharCargaMassivaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
	 * 
	 */
	private static final long serialVersionUID = -7082641373135440343L;

	/**
     * Field _numeroRemessa
     */
    private long _numeroRemessa = 0;

    /**
     * keeps track of state for field: _numeroRemessa
     */
    private boolean _has_numeroRemessa;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharCargaMassivaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroRemessa
     * 
     */
    public void deleteNumeroRemessa()
    {
        this._has_numeroRemessa= false;
    } //-- void deleteNumeroRemessa() 

    /**
     * Returns the value of field 'numeroRemessa'.
     * 
     * @return long
     * @return the value of field 'numeroRemessa'.
     */
    public long getNumeroRemessa()
    {
        return this._numeroRemessa;
    } //-- long getNumeroRemessa() 

    /**
     * Method hasNumeroRemessa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroRemessa()
    {
        return this._has_numeroRemessa;
    } //-- boolean hasNumeroRemessa() 

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
     * Sets the value of field 'numeroRemessa'.
     * 
     * @param numeroRemessa the value of field 'numeroRemessa'.
     */
    public void setNumeroRemessa(long numeroRemessa)
    {
        this._numeroRemessa = numeroRemessa;
        this._has_numeroRemessa = true;
    } //-- void setNumeroRemessa(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharCargaMassivaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.detalharcargamassiva.request.DetalharCargaMassivaRequest unmarshal(java.io.Reader) 

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
