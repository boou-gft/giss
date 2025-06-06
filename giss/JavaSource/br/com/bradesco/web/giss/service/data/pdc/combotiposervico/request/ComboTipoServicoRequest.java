/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ComboTipoServicoRequest.java,v 1.1 2017/04/11 14:09:46 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request;

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
 * Class ComboTipoServicoRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:46 $
 */
public class ComboTipoServicoRequest implements java.io.Serializable {


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
     * Field _tipoServico
     */
    private int _tipoServico = 0;

    /**
     * keeps track of state for field: _tipoServico
     */
    private boolean _has_tipoServico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComboTipoServicoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroMaximoOcorrencia
     * 
     */
    public void deleteNumeroMaximoOcorrencia()
    {
        this._has_numeroMaximoOcorrencia= false;
    } //-- void deleteNumeroMaximoOcorrencia() 

    /**
     * Method deleteTipoServico
     * 
     */
    public void deleteTipoServico()
    {
        this._has_tipoServico= false;
    } //-- void deleteTipoServico() 

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
     * Returns the value of field 'tipoServico'.
     * 
     * @return int
     * @return the value of field 'tipoServico'.
     */
    public int getTipoServico()
    {
        return this._tipoServico;
    } //-- int getTipoServico() 

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
     * Method hasTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTipoServico()
    {
        return this._has_tipoServico;
    } //-- boolean hasTipoServico() 

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
     * Sets the value of field 'tipoServico'.
     * 
     * @param tipoServico the value of field 'tipoServico'.
     */
    public void setTipoServico(int tipoServico)
    {
        this._tipoServico = tipoServico;
        this._has_tipoServico = true;
    } //-- void setTipoServico(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ComboTipoServicoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.combotiposervico.request.ComboTipoServicoRequest unmarshal(java.io.Reader) 

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
