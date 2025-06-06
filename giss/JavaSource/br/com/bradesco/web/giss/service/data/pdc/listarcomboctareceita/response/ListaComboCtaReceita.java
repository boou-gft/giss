/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaComboCtaReceita.java,v 1.4 2017/11/24 15:07:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response;

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
 * Class ListaComboCtaReceita.
 * 
 * @version $Revision: 1.4 $ $Date: 2017/11/24 15:07:17 $
 */
public class ListaComboCtaReceita implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codCtaReceita
     */
    private long _codCtaReceita = 0;

    /**
     * keeps track of state for field: _codCtaReceita
     */
    private boolean _has_codCtaReceita;

    /**
     * Field _descCtaReceita
     */
    private java.lang.String _descCtaReceita;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaComboCtaReceita() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodCtaReceita
     * 
     */
    public void deleteCodCtaReceita()
    {
        this._has_codCtaReceita= false;
    } //-- void deleteCodCtaReceita() 

    /**
     * Returns the value of field 'codCtaReceita'.
     * 
     * @return long
     * @return the value of field 'codCtaReceita'.
     */
    public long getCodCtaReceita()
    {
        return this._codCtaReceita;
    } //-- long getCodCtaReceita() 

    /**
     * Returns the value of field 'descCtaReceita'.
     * 
     * @return String
     * @return the value of field 'descCtaReceita'.
     */
    public java.lang.String getDescCtaReceita()
    {
        return this._descCtaReceita;
    } //-- java.lang.String getDescCtaReceita() 

    /**
     * Method hasCodCtaReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodCtaReceita()
    {
        return this._has_codCtaReceita;
    } //-- boolean hasCodCtaReceita() 

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
     * Sets the value of field 'codCtaReceita'.
     * 
     * @param codCtaReceita the value of field 'codCtaReceita'.
     */
    public void setCodCtaReceita(long codCtaReceita)
    {
        this._codCtaReceita = codCtaReceita;
        this._has_codCtaReceita = true;
    } //-- void setCodCtaReceita(long) 

    /**
     * Sets the value of field 'descCtaReceita'.
     * 
     * @param descCtaReceita the value of field 'descCtaReceita'.
     */
    public void setDescCtaReceita(java.lang.String descCtaReceita)
    {
        this._descCtaReceita = descCtaReceita;
    } //-- void setDescCtaReceita(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaComboCtaReceita
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.response.ListaComboCtaReceita unmarshal(java.io.Reader) 

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
