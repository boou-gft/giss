/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request;

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
 * Class ListaApuracaoParcialFinalRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListaApuracaoParcialFinalRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaxOcorrencia
     */
    private int _numeroMaxOcorrencia = 0;

    /**
     * keeps track of state for field: _numeroMaxOcorrencia
     */
    private boolean _has_numeroMaxOcorrencia;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _sequenciaOrganizada
     */
    private int _sequenciaOrganizada = 0;

    /**
     * keeps track of state for field: _sequenciaOrganizada
     */
    private boolean _has_sequenciaOrganizada;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaApuracaoParcialFinalRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest()


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
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteNumeroMaxOcorrencia
     * 
     */
    public void deleteNumeroMaxOcorrencia()
    {
        this._has_numeroMaxOcorrencia= false;
    } //-- void deleteNumeroMaxOcorrencia() 

    /**
     * Method deleteSequenciaOrganizada
     * 
     */
    public void deleteSequenciaOrganizada()
    {
        this._has_sequenciaOrganizada= false;
    } //-- void deleteSequenciaOrganizada() 

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
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'numeroMaxOcorrencia'.
     * 
     * @return int
     * @return the value of field 'numeroMaxOcorrencia'.
     */
    public int getNumeroMaxOcorrencia()
    {
        return this._numeroMaxOcorrencia;
    } //-- int getNumeroMaxOcorrencia() 

    /**
     * Returns the value of field 'sequenciaOrganizada'.
     * 
     * @return int
     * @return the value of field 'sequenciaOrganizada'.
     */
    public int getSequenciaOrganizada()
    {
        return this._sequenciaOrganizada;
    } //-- int getSequenciaOrganizada() 

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
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasNumeroMaxOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaxOcorrencia()
    {
        return this._has_numeroMaxOcorrencia;
    } //-- boolean hasNumeroMaxOcorrencia() 

    /**
     * Method hasSequenciaOrganizada
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSequenciaOrganizada()
    {
        return this._has_sequenciaOrganizada;
    } //-- boolean hasSequenciaOrganizada() 

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
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'numeroMaxOcorrencia'.
     * 
     * @param numeroMaxOcorrencia the value of field
     * 'numeroMaxOcorrencia'.
     */
    public void setNumeroMaxOcorrencia(int numeroMaxOcorrencia)
    {
        this._numeroMaxOcorrencia = numeroMaxOcorrencia;
        this._has_numeroMaxOcorrencia = true;
    } //-- void setNumeroMaxOcorrencia(int) 

    /**
     * Sets the value of field 'sequenciaOrganizada'.
     * 
     * @param sequenciaOrganizada the value of field
     * 'sequenciaOrganizada'.
     */
    public void setSequenciaOrganizada(int sequenciaOrganizada)
    {
        this._sequenciaOrganizada = sequenciaOrganizada;
        this._has_sequenciaOrganizada = true;
    } //-- void setSequenciaOrganizada(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaApuracaoParcialFinalRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.request.ListaApuracaoParcialFinalRequest unmarshal(java.io.Reader) 

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
