/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarEmpresaRequest.java,v 1.1 2017/04/11 14:11:40 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarempresa.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarEmpresaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:40 $
 */
public class ListarEmpresaRequest implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoEmpresa
     */
    private java.lang.String _codigoEmpresa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarEmpresaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'codigoEmpresa'.
     * 
     * @return String
     * @return the value of field 'codigoEmpresa'.
     */
    public java.lang.String getCodigoEmpresa()
    {
        return this._codigoEmpresa;
    } //-- java.lang.String getCodigoEmpresa() 

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
     * Sets the value of field 'codigoEmpresa'.
     * 
     * @param codigoEmpresa the value of field 'codigoEmpresa'.
     */
    public void setCodigoEmpresa(java.lang.String codigoEmpresa)
    {
        this._codigoEmpresa = codigoEmpresa;
    } //-- void setCodigoEmpresa(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarEmpresaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarempresa.request.ListarEmpresaRequest unmarshal(java.io.Reader) 

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
