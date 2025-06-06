/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: DetalharDenpendenciasEncerradasRequest.java,v 1.1 2017/04/11 14:12:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request;

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
 * Class DetalharDenpendenciasEncerradasRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:17 $
 */
public class DetalharDenpendenciasEncerradasRequest implements java.io.Serializable {


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


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharDenpendenciasEncerradasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest()


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
     * @return DetalharDenpendenciasEncerradasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.request.DetalharDenpendenciasEncerradasRequest unmarshal(java.io.Reader) 

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
