/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaConsultarLupaMunicipio.java,v 1.2 2017/12/08 17:29:22 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response;

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
 * Class ListaConsultarLupaMunicipio.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/12/08 17:29:22 $
 */
public class ListaConsultarLupaMunicipio implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _municipio
     */
    private java.lang.String _municipio;

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

    public ListaConsultarLupaMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio()


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
     * Returns the value of field 'municipio'.
     * 
     * @return String
     * @return the value of field 'municipio'.
     */
    public java.lang.String getMunicipio()
    {
        return this._municipio;
    } //-- java.lang.String getMunicipio() 

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
     * Sets the value of field 'municipio'.
     * 
     * @param municipio the value of field 'municipio'.
     */
    public void setMunicipio(java.lang.String municipio)
    {
        this._municipio = municipio;
    } //-- void setMunicipio(java.lang.String) 

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
     * @return ListaConsultarLupaMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.response.ListaConsultarLupaMunicipio unmarshal(java.io.Reader) 

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
