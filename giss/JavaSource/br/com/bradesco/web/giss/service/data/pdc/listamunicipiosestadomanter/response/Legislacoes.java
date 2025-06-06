/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Legislacoes.java,v 1.2 2017/06/05 15:06:08 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response;

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
 * Class Legislacoes.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/06/05 15:06:08 $
 */
public class Legislacoes implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoLegislacao
     */
    private int _codigoLegislacao = 0;

    /**
     * keeps track of state for field: _codigoLegislacao
     */
    private boolean _has_codigoLegislacao;

    /**
     * Field _descLegislacao
     */
    private java.lang.String _descLegislacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public Legislacoes() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoLegislacao
     * 
     */
    public void deleteCodigoLegislacao()
    {
        this._has_codigoLegislacao= false;
    } //-- void deleteCodigoLegislacao() 

    /**
     * Returns the value of field 'codigoLegislacao'.
     * 
     * @return int
     * @return the value of field 'codigoLegislacao'.
     */
    public int getCodigoLegislacao()
    {
        return this._codigoLegislacao;
    } //-- int getCodigoLegislacao() 

    /**
     * Returns the value of field 'descLegislacao'.
     * 
     * @return String
     * @return the value of field 'descLegislacao'.
     */
    public java.lang.String getDescLegislacao()
    {
        return this._descLegislacao;
    } //-- java.lang.String getDescLegislacao() 

    /**
     * Method hasCodigoLegislacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLegislacao()
    {
        return this._has_codigoLegislacao;
    } //-- boolean hasCodigoLegislacao() 

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
     * Sets the value of field 'codigoLegislacao'.
     * 
     * @param codigoLegislacao the value of field 'codigoLegislacao'
     */
    public void setCodigoLegislacao(int codigoLegislacao)
    {
        this._codigoLegislacao = codigoLegislacao;
        this._has_codigoLegislacao = true;
    } //-- void setCodigoLegislacao(int) 

    /**
     * Sets the value of field 'descLegislacao'.
     * 
     * @param descLegislacao the value of field 'descLegislacao'.
     */
    public void setDescLegislacao(java.lang.String descLegislacao)
    {
        this._descLegislacao = descLegislacao;
    } //-- void setDescLegislacao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Legislacoes
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.response.Legislacoes unmarshal(java.io.Reader) 

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
