/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Consultas.java,v 1.1 2017/04/11 14:07:26 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response;

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
 * Class Consultas.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:07:26 $
 */
public class Consultas implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroContas
     */
    private long _numeroContas = 0;

    /**
     * keeps track of state for field: _numeroContas
     */
    private boolean _has_numeroContas;

    /**
     * Field _descricaoConta
     */
    private java.lang.String _descricaoConta;

    /**
     * Field _aliquota
     */
    private double _aliquota = 0;

    /**
     * keeps track of state for field: _aliquota
     */
    private boolean _has_aliquota;

    /**
     * Field _codigoTributo
     */
    private int _codigoTributo = 0;

    /**
     * keeps track of state for field: _codigoTributo
     */
    private boolean _has_codigoTributo;


      //----------------/
     //- Constructors -/
    //----------------/

    public Consultas() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Consultas()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliquota
     * 
     */
    public void deleteAliquota()
    {
        this._has_aliquota= false;
    } //-- void deleteAliquota() 

    /**
     * Method deleteCodigoTributo
     * 
     */
    public void deleteCodigoTributo()
    {
        this._has_codigoTributo= false;
    } //-- void deleteCodigoTributo() 

    /**
     * Method deleteNumeroContas
     * 
     */
    public void deleteNumeroContas()
    {
        this._has_numeroContas= false;
    } //-- void deleteNumeroContas() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return double
     * @return the value of field 'aliquota'.
     */
    public double getAliquota()
    {
        return this._aliquota;
    } //-- double getAliquota() 

    /**
     * Returns the value of field 'codigoTributo'.
     * 
     * @return int
     * @return the value of field 'codigoTributo'.
     */
    public int getCodigoTributo()
    {
        return this._codigoTributo;
    } //-- int getCodigoTributo() 

    /**
     * Returns the value of field 'descricaoConta'.
     * 
     * @return String
     * @return the value of field 'descricaoConta'.
     */
    public java.lang.String getDescricaoConta()
    {
        return this._descricaoConta;
    } //-- java.lang.String getDescricaoConta() 

    /**
     * Returns the value of field 'numeroContas'.
     * 
     * @return long
     * @return the value of field 'numeroContas'.
     */
    public long getNumeroContas()
    {
        return this._numeroContas;
    } //-- long getNumeroContas() 

    /**
     * Method hasAliquota
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquota()
    {
        return this._has_aliquota;
    } //-- boolean hasAliquota() 

    /**
     * Method hasCodigoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTributo()
    {
        return this._has_codigoTributo;
    } //-- boolean hasCodigoTributo() 

    /**
     * Method hasNumeroContas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroContas()
    {
        return this._has_numeroContas;
    } //-- boolean hasNumeroContas() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(double aliquota)
    {
        this._aliquota = aliquota;
        this._has_aliquota = true;
    } //-- void setAliquota(double) 

    /**
     * Sets the value of field 'codigoTributo'.
     * 
     * @param codigoTributo the value of field 'codigoTributo'.
     */
    public void setCodigoTributo(int codigoTributo)
    {
        this._codigoTributo = codigoTributo;
        this._has_codigoTributo = true;
    } //-- void setCodigoTributo(int) 

    /**
     * Sets the value of field 'descricaoConta'.
     * 
     * @param descricaoConta the value of field 'descricaoConta'.
     */
    public void setDescricaoConta(java.lang.String descricaoConta)
    {
        this._descricaoConta = descricaoConta;
    } //-- void setDescricaoConta(java.lang.String) 

    /**
     * Sets the value of field 'numeroContas'.
     * 
     * @param numeroContas the value of field 'numeroContas'.
     */
    public void setNumeroContas(long numeroContas)
    {
        this._numeroContas = numeroContas;
        this._has_numeroContas = true;
    } //-- void setNumeroContas(long) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Consultas
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Consultas unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Consultas) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Consultas.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Consultas unmarshal(java.io.Reader) 

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
