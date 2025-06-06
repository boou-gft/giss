/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request;

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
 * Class ConsultarDependenciaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarDependenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _sequencialUnidadeOrganizacional
     */
    private int _sequencialUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _sequencialUnidadeOrganizacional
     */
    private boolean _has_sequencialUnidadeOrganizacional;

    /**
     * Field _dataRegistroHistorico
     */
    private java.lang.String _dataRegistroHistorico;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteSequencialUnidadeOrganizacional
     * 
     */
    public void deleteSequencialUnidadeOrganizacional()
    {
        this._has_sequencialUnidadeOrganizacional= false;
    } //-- void deleteSequencialUnidadeOrganizacional() 

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
     * Returns the value of field 'dataRegistroHistorico'.
     * 
     * @return String
     * @return the value of field 'dataRegistroHistorico'.
     */
    public java.lang.String getDataRegistroHistorico()
    {
        return this._dataRegistroHistorico;
    } //-- java.lang.String getDataRegistroHistorico() 

    /**
     * Returns the value of field
     * 'sequencialUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'sequencialUnidadeOrganizacional'.
     */
    public int getSequencialUnidadeOrganizacional()
    {
        return this._sequencialUnidadeOrganizacional;
    } //-- int getSequencialUnidadeOrganizacional() 

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
     * Method hasSequencialUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSequencialUnidadeOrganizacional()
    {
        return this._has_sequencialUnidadeOrganizacional;
    } //-- boolean hasSequencialUnidadeOrganizacional() 

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
     * Sets the value of field 'dataRegistroHistorico'.
     * 
     * @param dataRegistroHistorico the value of field
     * 'dataRegistroHistorico'.
     */
    public void setDataRegistroHistorico(java.lang.String dataRegistroHistorico)
    {
        this._dataRegistroHistorico = dataRegistroHistorico;
    } //-- void setDataRegistroHistorico(java.lang.String) 

    /**
     * Sets the value of field 'sequencialUnidadeOrganizacional'.
     * 
     * @param sequencialUnidadeOrganizacional the value of field
     * 'sequencialUnidadeOrganizacional'.
     */
    public void setSequencialUnidadeOrganizacional(int sequencialUnidadeOrganizacional)
    {
        this._sequencialUnidadeOrganizacional = sequencialUnidadeOrganizacional;
        this._has_sequencialUnidadeOrganizacional = true;
    } //-- void setSequencialUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependencia.request.ConsultarDependenciaRequest unmarshal(java.io.Reader) 

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
