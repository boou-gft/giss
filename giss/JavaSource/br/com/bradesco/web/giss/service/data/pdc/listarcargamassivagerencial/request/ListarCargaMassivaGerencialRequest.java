/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request;

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
 * Class ListarCargaMassivaGerencialRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarCargaMassivaGerencialRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anoMesInicio
     */
    private int _anoMesInicio = 0;

    /**
     * keeps track of state for field: _anoMesInicio
     */
    private boolean _has_anoMesInicio;

    /**
     * Field _anoMesFim
     */
    private int _anoMesFim = 0;

    /**
     * keeps track of state for field: _anoMesFim
     */
    private boolean _has_anoMesFim;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarCargaMassivaGerencialRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMesFim
     * 
     */
    public void deleteAnoMesFim()
    {
        this._has_anoMesFim= false;
    } //-- void deleteAnoMesFim() 

    /**
     * Method deleteAnoMesInicio
     * 
     */
    public void deleteAnoMesInicio()
    {
        this._has_anoMesInicio= false;
    } //-- void deleteAnoMesInicio() 

    /**
     * Returns the value of field 'anoMesFim'.
     * 
     * @return int
     * @return the value of field 'anoMesFim'.
     */
    public int getAnoMesFim()
    {
        return this._anoMesFim;
    } //-- int getAnoMesFim() 

    /**
     * Returns the value of field 'anoMesInicio'.
     * 
     * @return int
     * @return the value of field 'anoMesInicio'.
     */
    public int getAnoMesInicio()
    {
        return this._anoMesInicio;
    } //-- int getAnoMesInicio() 

    /**
     * Method hasAnoMesFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesFim()
    {
        return this._has_anoMesFim;
    } //-- boolean hasAnoMesFim() 

    /**
     * Method hasAnoMesInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesInicio()
    {
        return this._has_anoMesInicio;
    } //-- boolean hasAnoMesInicio() 

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
     * Sets the value of field 'anoMesFim'.
     * 
     * @param anoMesFim the value of field 'anoMesFim'.
     */
    public void setAnoMesFim(int anoMesFim)
    {
        this._anoMesFim = anoMesFim;
        this._has_anoMesFim = true;
    } //-- void setAnoMesFim(int) 

    /**
     * Sets the value of field 'anoMesInicio'.
     * 
     * @param anoMesInicio the value of field 'anoMesInicio'.
     */
    public void setAnoMesInicio(int anoMesInicio)
    {
        this._anoMesInicio = anoMesInicio;
        this._has_anoMesInicio = true;
    } //-- void setAnoMesInicio(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarCargaMassivaGerencialRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.request.ListarCargaMassivaGerencialRequest unmarshal(java.io.Reader) 

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
