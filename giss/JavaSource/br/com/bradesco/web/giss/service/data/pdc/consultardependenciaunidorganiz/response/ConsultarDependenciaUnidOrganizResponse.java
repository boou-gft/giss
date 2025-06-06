/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarDependenciaUnidOrganizResponse.java,v 1.1 2017/04/11 14:09:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response;

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
 * Class ConsultarDependenciaUnidOrganizResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:10 $
 */
public class ConsultarDependenciaUnidOrganizResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequencialUnidadeOrganizacional
     */
    private int _numeroSequencialUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialUnidadeOrganizacional
     */
    private boolean _has_numeroSequencialUnidadeOrganizacional;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarDependenciaUnidOrganizResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse()


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
     * Method deleteNumeroSequencialUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequencialUnidadeOrganizacional()
    {
        this._has_numeroSequencialUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequencialUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

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
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     */
    public int getNumeroSequencialUnidadeOrganizacional()
    {
        return this._numeroSequencialUnidadeOrganizacional;
    } //-- int getNumeroSequencialUnidadeOrganizacional() 

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
     * Method hasNumeroSequencialUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialUnidadeOrganizacional()
    {
        return this._has_numeroSequencialUnidadeOrganizacional;
    } //-- boolean hasNumeroSequencialUnidadeOrganizacional() 

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
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

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
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field
     * 'numeroSequencialUnidadeOrganizacional'.
     * 
     * @param numeroSequencialUnidadeOrganizacional the value of
     * field 'numeroSequencialUnidadeOrganizacional'.
     */
    public void setNumeroSequencialUnidadeOrganizacional(int numeroSequencialUnidadeOrganizacional)
    {
        this._numeroSequencialUnidadeOrganizacional = numeroSequencialUnidadeOrganizacional;
        this._has_numeroSequencialUnidadeOrganizacional = true;
    } //-- void setNumeroSequencialUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarDependenciaUnidOrganizResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.response.ConsultarDependenciaUnidOrganizResponse unmarshal(java.io.Reader) 

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
