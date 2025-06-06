/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request;

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
 * Class AlterarPercentualTransicaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class AlterarPercentualTransicaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numParmDistrIss
     */
    private int _numParmDistrIss = 0;

    /**
     * keeps track of state for field: _numParmDistrIss
     */
    private boolean _has_numParmDistrIss;

    /**
     * Field _ptgDistrIssTomador
     */
    private double _ptgDistrIssTomador = 0;

    /**
     * keeps track of state for field: _ptgDistrIssTomador
     */
    private boolean _has_ptgDistrIssTomador;

    /**
     * Field _ptgDistrIssPrestador
     */
    private double _ptgDistrIssPrestador = 0;

    /**
     * keeps track of state for field: _ptgDistrIssPrestador
     */
    private boolean _has_ptgDistrIssPrestador;

    /**
     * Field _dtIniVigencia
     */
    private java.lang.String _dtIniVigencia;

    /**
     * Field _dtFimVigencia
     */
    private java.lang.String _dtFimVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarPercentualTransicaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumParmDistrIss
     * 
     */
    public void deleteNumParmDistrIss()
    {
        this._has_numParmDistrIss= false;
    } //-- void deleteNumParmDistrIss() 

    /**
     * Method deletePtgDistrIssPrestador
     * 
     */
    public void deletePtgDistrIssPrestador()
    {
        this._has_ptgDistrIssPrestador= false;
    } //-- void deletePtgDistrIssPrestador() 

    /**
     * Method deletePtgDistrIssTomador
     * 
     */
    public void deletePtgDistrIssTomador()
    {
        this._has_ptgDistrIssTomador= false;
    } //-- void deletePtgDistrIssTomador() 

    /**
     * Returns the value of field 'dtFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dtFimVigencia'.
     */
    public java.lang.String getDtFimVigencia()
    {
        return this._dtFimVigencia;
    } //-- java.lang.String getDtFimVigencia() 

    /**
     * Returns the value of field 'dtIniVigencia'.
     * 
     * @return String
     * @return the value of field 'dtIniVigencia'.
     */
    public java.lang.String getDtIniVigencia()
    {
        return this._dtIniVigencia;
    } //-- java.lang.String getDtIniVigencia() 

    /**
     * Returns the value of field 'numParmDistrIss'.
     * 
     * @return int
     * @return the value of field 'numParmDistrIss'.
     */
    public int getNumParmDistrIss()
    {
        return this._numParmDistrIss;
    } //-- int getNumParmDistrIss() 

    /**
     * Returns the value of field 'ptgDistrIssPrestador'.
     * 
     * @return double
     * @return the value of field 'ptgDistrIssPrestador'.
     */
    public double getPtgDistrIssPrestador()
    {
        return this._ptgDistrIssPrestador;
    } //-- double getPtgDistrIssPrestador() 

    /**
     * Returns the value of field 'ptgDistrIssTomador'.
     * 
     * @return double
     * @return the value of field 'ptgDistrIssTomador'.
     */
    public double getPtgDistrIssTomador()
    {
        return this._ptgDistrIssTomador;
    } //-- double getPtgDistrIssTomador() 

    /**
     * Method hasNumParmDistrIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumParmDistrIss()
    {
        return this._has_numParmDistrIss;
    } //-- boolean hasNumParmDistrIss() 

    /**
     * Method hasPtgDistrIssPrestador
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPtgDistrIssPrestador()
    {
        return this._has_ptgDistrIssPrestador;
    } //-- boolean hasPtgDistrIssPrestador() 

    /**
     * Method hasPtgDistrIssTomador
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPtgDistrIssTomador()
    {
        return this._has_ptgDistrIssTomador;
    } //-- boolean hasPtgDistrIssTomador() 

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
     * Sets the value of field 'dtFimVigencia'.
     * 
     * @param dtFimVigencia the value of field 'dtFimVigencia'.
     */
    public void setDtFimVigencia(java.lang.String dtFimVigencia)
    {
        this._dtFimVigencia = dtFimVigencia;
    } //-- void setDtFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dtIniVigencia'.
     * 
     * @param dtIniVigencia the value of field 'dtIniVigencia'.
     */
    public void setDtIniVigencia(java.lang.String dtIniVigencia)
    {
        this._dtIniVigencia = dtIniVigencia;
    } //-- void setDtIniVigencia(java.lang.String) 

    /**
     * Sets the value of field 'numParmDistrIss'.
     * 
     * @param numParmDistrIss the value of field 'numParmDistrIss'.
     */
    public void setNumParmDistrIss(int numParmDistrIss)
    {
        this._numParmDistrIss = numParmDistrIss;
        this._has_numParmDistrIss = true;
    } //-- void setNumParmDistrIss(int) 

    /**
     * Sets the value of field 'ptgDistrIssPrestador'.
     * 
     * @param ptgDistrIssPrestador the value of field
     * 'ptgDistrIssPrestador'.
     */
    public void setPtgDistrIssPrestador(double ptgDistrIssPrestador)
    {
        this._ptgDistrIssPrestador = ptgDistrIssPrestador;
        this._has_ptgDistrIssPrestador = true;
    } //-- void setPtgDistrIssPrestador(double) 

    /**
     * Sets the value of field 'ptgDistrIssTomador'.
     * 
     * @param ptgDistrIssTomador the value of field
     * 'ptgDistrIssTomador'.
     */
    public void setPtgDistrIssTomador(double ptgDistrIssTomador)
    {
        this._ptgDistrIssTomador = ptgDistrIssTomador;
        this._has_ptgDistrIssTomador = true;
    } //-- void setPtgDistrIssTomador(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AlterarPercentualTransicaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.request.AlterarPercentualTransicaoRequest unmarshal(java.io.Reader) 

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
