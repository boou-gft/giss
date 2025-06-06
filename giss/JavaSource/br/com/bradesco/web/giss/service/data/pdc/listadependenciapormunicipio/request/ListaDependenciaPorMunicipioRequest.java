/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request;

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
 * Class ListaDependenciaPorMunicipioRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListaDependenciaPorMunicipioRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistro
     */
    private int _qtdeRegistro = 0;

    /**
     * keeps track of state for field: _qtdeRegistro
     */
    private boolean _has_qtdeRegistro;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaDependenciaPorMunicipioRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteQtdeRegistro
     * 
     */
    public void deleteQtdeRegistro()
    {
        this._has_qtdeRegistro= false;
    } //-- void deleteQtdeRegistro() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

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
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'qtdeRegistro'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistro'.
     */
    public int getQtdeRegistro()
    {
        return this._qtdeRegistro;
    } //-- int getQtdeRegistro() 

    /**
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

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
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasQtdeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistro()
    {
        return this._has_qtdeRegistro;
    } //-- boolean hasQtdeRegistro() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

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
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'qtdeRegistro'.
     * 
     * @param qtdeRegistro the value of field 'qtdeRegistro'.
     */
    public void setQtdeRegistro(int qtdeRegistro)
    {
        this._qtdeRegistro = qtdeRegistro;
        this._has_qtdeRegistro = true;
    } //-- void setQtdeRegistro(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaDependenciaPorMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.request.ListaDependenciaPorMunicipioRequest unmarshal(java.io.Reader) 

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
