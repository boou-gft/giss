/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Dependencias.java,v 1.1 2017/04/11 14:09:23 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request;

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
 * Class Dependencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:23 $
 */
public class Dependencias implements java.io.Serializable {


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
     * Field _nroSeqUndOrganizacional
     */
    private int _nroSeqUndOrganizacional = 0;

    /**
     * keeps track of state for field: _nroSeqUndOrganizacional
     */
    private boolean _has_nroSeqUndOrganizacional;


      //----------------/
     //- Constructors -/
    //----------------/

    public Dependencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias()


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
     * Method deleteNroSeqUndOrganizacional
     * 
     */
    public void deleteNroSeqUndOrganizacional()
    {
        this._has_nroSeqUndOrganizacional= false;
    } //-- void deleteNroSeqUndOrganizacional() 

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
     * Returns the value of field 'nroSeqUndOrganizacional'.
     * 
     * @return int
     * @return the value of field 'nroSeqUndOrganizacional'.
     */
    public int getNroSeqUndOrganizacional()
    {
        return this._nroSeqUndOrganizacional;
    } //-- int getNroSeqUndOrganizacional() 

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
     * Method hasNroSeqUndOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroSeqUndOrganizacional()
    {
        return this._has_nroSeqUndOrganizacional;
    } //-- boolean hasNroSeqUndOrganizacional() 

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
     * Sets the value of field 'nroSeqUndOrganizacional'.
     * 
     * @param nroSeqUndOrganizacional the value of field
     * 'nroSeqUndOrganizacional'.
     */
    public void setNroSeqUndOrganizacional(int nroSeqUndOrganizacional)
    {
        this._nroSeqUndOrganizacional = nroSeqUndOrganizacional;
        this._has_nroSeqUndOrganizacional = true;
    } //-- void setNroSeqUndOrganizacional(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Dependencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias unmarshal(java.io.Reader) 

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
