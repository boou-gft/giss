/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ExcluirDependenciaRequest.java,v 1.1 2017/04/11 14:09:36 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request;

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
 * Class ExcluirDependenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:36 $
 */
public class ExcluirDependenciaRequest implements java.io.Serializable {


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
     * Field _numeroUnidadeOrganizacional
     */
    private int _numeroUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numeroUnidadeOrganizacional
     */
    private boolean _has_numeroUnidadeOrganizacional;


      //----------------/
     //- Constructors -/
    //----------------/

    public ExcluirDependenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest()


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
     * Method deleteNumeroUnidadeOrganizacional
     * 
     */
    public void deleteNumeroUnidadeOrganizacional()
    {
        this._has_numeroUnidadeOrganizacional= false;
    } //-- void deleteNumeroUnidadeOrganizacional() 

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
     * Returns the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numeroUnidadeOrganizacional'.
     */
    public int getNumeroUnidadeOrganizacional()
    {
        return this._numeroUnidadeOrganizacional;
    } //-- int getNumeroUnidadeOrganizacional() 

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
     * Method hasNumeroUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroUnidadeOrganizacional()
    {
        return this._has_numeroUnidadeOrganizacional;
    } //-- boolean hasNumeroUnidadeOrganizacional() 

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
     * Sets the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @param numeroUnidadeOrganizacional the value of field
     * 'numeroUnidadeOrganizacional'.
     */
    public void setNumeroUnidadeOrganizacional(int numeroUnidadeOrganizacional)
    {
        this._numeroUnidadeOrganizacional = numeroUnidadeOrganizacional;
        this._has_numeroUnidadeOrganizacional = true;
    } //-- void setNumeroUnidadeOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ExcluirDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.request.ExcluirDependenciaRequest unmarshal(java.io.Reader) 

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
