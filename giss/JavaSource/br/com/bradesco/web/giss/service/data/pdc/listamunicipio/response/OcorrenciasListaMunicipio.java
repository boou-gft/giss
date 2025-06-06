/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasListaMunicipio.java,v 1.1 2017/04/11 14:06:56 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class OcorrenciasListaMunicipio.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:06:56 $
 */
public class OcorrenciasListaMunicipio implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _siglaEstado
     */
    private java.lang.String _siglaEstado;

    /**
     * Field _codMunicipioAgeo
     */
    private long _codMunicipioAgeo = 0;

    /**
     * keeps track of state for field: _codMunicipioAgeo
     */
    private boolean _has_codMunicipioAgeo;

    /**
     * Field _codMunicipioIrecp
     */
    private long _codMunicipioIrecp = 0;

    /**
     * keeps track of state for field: _codMunicipioIrecp
     */
    private boolean _has_codMunicipioIrecp;

    /**
     * Field _codUfIrecp
     */
    private java.lang.String _codUfIrecp;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasListaMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipioAgeo
     * 
     */
    public void deleteCodMunicipioAgeo()
    {
        this._has_codMunicipioAgeo= false;
    } //-- void deleteCodMunicipioAgeo() 

    /**
     * Method deleteCodMunicipioIrecp
     * 
     */
    public void deleteCodMunicipioIrecp()
    {
        this._has_codMunicipioIrecp= false;
    } //-- void deleteCodMunicipioIrecp() 

    /**
     * Returns the value of field 'codMunicipioAgeo'.
     * 
     * @return long
     * @return the value of field 'codMunicipioAgeo'.
     */
    public long getCodMunicipioAgeo()
    {
        return this._codMunicipioAgeo;
    } //-- long getCodMunicipioAgeo() 

    /**
     * Returns the value of field 'codMunicipioIrecp'.
     * 
     * @return long
     * @return the value of field 'codMunicipioIrecp'.
     */
    public long getCodMunicipioIrecp()
    {
        return this._codMunicipioIrecp;
    } //-- long getCodMunicipioIrecp() 

    /**
     * Returns the value of field 'codUfIrecp'.
     * 
     * @return String
     * @return the value of field 'codUfIrecp'.
     */
    public java.lang.String getCodUfIrecp()
    {
        return this._codUfIrecp;
    } //-- java.lang.String getCodUfIrecp() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'siglaEstado'.
     * 
     * @return String
     * @return the value of field 'siglaEstado'.
     */
    public java.lang.String getSiglaEstado()
    {
        return this._siglaEstado;
    } //-- java.lang.String getSiglaEstado() 

    /**
     * Method hasCodMunicipioAgeo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioAgeo()
    {
        return this._has_codMunicipioAgeo;
    } //-- boolean hasCodMunicipioAgeo() 

    /**
     * Method hasCodMunicipioIrecp
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioIrecp()
    {
        return this._has_codMunicipioIrecp;
    } //-- boolean hasCodMunicipioIrecp() 

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
     * Sets the value of field 'codMunicipioAgeo'.
     * 
     * @param codMunicipioAgeo the value of field 'codMunicipioAgeo'
     */
    public void setCodMunicipioAgeo(long codMunicipioAgeo)
    {
        this._codMunicipioAgeo = codMunicipioAgeo;
        this._has_codMunicipioAgeo = true;
    } //-- void setCodMunicipioAgeo(long) 

    /**
     * Sets the value of field 'codMunicipioIrecp'.
     * 
     * @param codMunicipioIrecp the value of field
     * 'codMunicipioIrecp'.
     */
    public void setCodMunicipioIrecp(long codMunicipioIrecp)
    {
        this._codMunicipioIrecp = codMunicipioIrecp;
        this._has_codMunicipioIrecp = true;
    } //-- void setCodMunicipioIrecp(long) 

    /**
     * Sets the value of field 'codUfIrecp'.
     * 
     * @param codUfIrecp the value of field 'codUfIrecp'.
     */
    public void setCodUfIrecp(java.lang.String codUfIrecp)
    {
        this._codUfIrecp = codUfIrecp;
    } //-- void setCodUfIrecp(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'siglaEstado'.
     * 
     * @param siglaEstado the value of field 'siglaEstado'.
     */
    public void setSiglaEstado(java.lang.String siglaEstado)
    {
        this._siglaEstado = siglaEstado;
    } //-- void setSiglaEstado(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasListaMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipio.response.OcorrenciasListaMunicipio unmarshal(java.io.Reader) 

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
