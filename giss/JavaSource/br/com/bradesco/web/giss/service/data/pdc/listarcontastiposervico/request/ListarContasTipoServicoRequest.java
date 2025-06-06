/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request;

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
 * Class ListarContasTipoServicoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarContasTipoServicoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencia
     */
    private int _numeroMaximoOcorrencia = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencia
     */
    private boolean _has_numeroMaximoOcorrencia;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoTipoServicoV
     */
    private int _codigoTipoServicoV = 0;

    /**
     * keeps track of state for field: _codigoTipoServicoV
     */
    private boolean _has_codigoTipoServicoV;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarContasTipoServicoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoTipoServicoV
     * 
     */
    public void deleteCodigoTipoServicoV()
    {
        this._has_codigoTipoServicoV= false;
    } //-- void deleteCodigoTipoServicoV() 

    /**
     * Method deleteNumeroMaximoOcorrencia
     * 
     */
    public void deleteNumeroMaximoOcorrencia()
    {
        this._has_numeroMaximoOcorrencia= false;
    } //-- void deleteNumeroMaximoOcorrencia() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoTipoServicoV'.
     * 
     * @return int
     * @return the value of field 'codigoTipoServicoV'.
     */
    public int getCodigoTipoServicoV()
    {
        return this._codigoTipoServicoV;
    } //-- int getCodigoTipoServicoV() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencia'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencia'.
     */
    public int getNumeroMaximoOcorrencia()
    {
        return this._numeroMaximoOcorrencia;
    } //-- int getNumeroMaximoOcorrencia() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

    /**
     * Method hasCodigoTipoServicoV
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoServicoV()
    {
        return this._has_codigoTipoServicoV;
    } //-- boolean hasCodigoTipoServicoV() 

    /**
     * Method hasNumeroMaximoOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencia()
    {
        return this._has_numeroMaximoOcorrencia;
    } //-- boolean hasNumeroMaximoOcorrencia() 

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
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'codigoTipoServicoV'.
     * 
     * @param codigoTipoServicoV the value of field
     * 'codigoTipoServicoV'.
     */
    public void setCodigoTipoServicoV(int codigoTipoServicoV)
    {
        this._codigoTipoServicoV = codigoTipoServicoV;
        this._has_codigoTipoServicoV = true;
    } //-- void setCodigoTipoServicoV(int) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencia'.
     * 
     * @param numeroMaximoOcorrencia the value of field
     * 'numeroMaximoOcorrencia'.
     */
    public void setNumeroMaximoOcorrencia(int numeroMaximoOcorrencia)
    {
        this._numeroMaximoOcorrencia = numeroMaximoOcorrencia;
        this._has_numeroMaximoOcorrencia = true;
    } //-- void setNumeroMaximoOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarContasTipoServicoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.request.ListarContasTipoServicoRequest unmarshal(java.io.Reader) 

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
