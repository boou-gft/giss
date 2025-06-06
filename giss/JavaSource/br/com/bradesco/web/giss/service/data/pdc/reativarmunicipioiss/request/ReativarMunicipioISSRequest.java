/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request;

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
 * Class ReativarMunicipioISSRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ReativarMunicipioISSRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReativarMunicipioISSRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ReativarMunicipioISSRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.request.ReativarMunicipioISSRequest unmarshal(java.io.Reader) 

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
