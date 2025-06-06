/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarComboDescItemServRequest.java,v 1.4 2017/11/15 22:17:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request;

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
 * Class ListarComboDescItemServRequest.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/15 22:17:09 $
 */
public class ListarComboDescItemServRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private java.lang.String _codEmpresa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarComboDescItemServRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return String
     * @return the value of field 'codEmpresa'.
     */
    public java.lang.String getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- java.lang.String getCodEmpresa() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(java.lang.String codEmpresa)
    {
        this._codEmpresa = codEmpresa;
    } //-- void setCodEmpresa(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarComboDescItemServRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.request.ListarComboDescItemServRequest unmarshal(java.io.Reader) 

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
