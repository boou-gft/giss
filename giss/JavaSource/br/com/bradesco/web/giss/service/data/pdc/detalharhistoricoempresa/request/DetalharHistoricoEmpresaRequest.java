/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request;

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
 * Class DetalharHistoricoEmpresaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharHistoricoEmpresaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharHistoricoEmpresaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

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
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharHistoricoEmpresaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.request.DetalharHistoricoEmpresaRequest unmarshal(java.io.Reader) 

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
