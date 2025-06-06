/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:07:28 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:07:28 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroContaContabil
     */
    private long _numeroContaContabil = 0;

    /**
     * keeps track of state for field: _numeroContaContabil
     */
    private boolean _has_numeroContaContabil;

    /**
     * Field _nomeContaContabil
     */
    private java.lang.String _nomeContaContabil;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroContaContabil
     * 
     */
    public void deleteNumeroContaContabil()
    {
        this._has_numeroContaContabil= false;
    } //-- void deleteNumeroContaContabil() 

    /**
     * Returns the value of field 'nomeContaContabil'.
     * 
     * @return String
     * @return the value of field 'nomeContaContabil'.
     */
    public java.lang.String getNomeContaContabil()
    {
        return this._nomeContaContabil;
    } //-- java.lang.String getNomeContaContabil() 

    /**
     * Returns the value of field 'numeroContaContabil'.
     * 
     * @return long
     * @return the value of field 'numeroContaContabil'.
     */
    public long getNumeroContaContabil()
    {
        return this._numeroContaContabil;
    } //-- long getNumeroContaContabil() 

    /**
     * Method hasNumeroContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroContaContabil()
    {
        return this._has_numeroContaContabil;
    } //-- boolean hasNumeroContaContabil() 

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
     * Sets the value of field 'nomeContaContabil'.
     * 
     * @param nomeContaContabil the value of field
     * 'nomeContaContabil'.
     */
    public void setNomeContaContabil(java.lang.String nomeContaContabil)
    {
        this._nomeContaContabil = nomeContaContabil;
    } //-- void setNomeContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'numeroContaContabil'.
     * 
     * @param numeroContaContabil the value of field
     * 'numeroContaContabil'.
     */
    public void setNumeroContaContabil(long numeroContaContabil)
    {
        this._numeroContaContabil = numeroContaContabil;
        this._has_numeroContaContabil = true;
    } //-- void setNumeroContaContabil(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.response.Ocorrencias unmarshal(java.io.Reader) 

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
