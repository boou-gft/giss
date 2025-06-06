/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.request;

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
 * Class ParametrizacaoDepIncluirRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ParametrizacaoDepIncluirRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _eTipoDeManutenceo
     */
    private java.lang.String _eTipoDeManutenceo;

    /**
     * Field _eCmunBacen
     */
    private long _eCmunBacen = 0;

    /**
     * keeps track of state for field: _eCmunBacen
     */
    private boolean _has_eCmunBacen;

    /**
     * Field _eCpssoaJurid
     */
    private long _eCpssoaJurid = 0;

    /**
     * keeps track of state for field: _eCpssoaJurid
     */
    private boolean _has_eCpssoaJurid;

    /**
     * Field _eNseqUndOrgnz
     */
    private int _eNseqUndOrgnz = 0;

    /**
     * keeps track of state for field: _eNseqUndOrgnz
     */
    private boolean _has_eNseqUndOrgnz;

    /**
     * Field _eCchaveSegrcPreft
     */
    private java.lang.String _eCchaveSegrcPreft;

    /**
     * Field _eEurlPreftMun
     */
    private java.lang.String _eEurlPreftMun;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParametrizacaoDepIncluirRequest() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteECmunBacen
     * 
     */
    public void deleteECmunBacen()
    {
        this._has_eCmunBacen= false;
    } //-- void deleteECmunBacen() 

    /**
     * Method deleteECpssoaJurid
     * 
     */
    public void deleteECpssoaJurid()
    {
        this._has_eCpssoaJurid= false;
    } //-- void deleteECpssoaJurid() 

    /**
     * Method deleteENseqUndOrgnz
     * 
     */
    public void deleteENseqUndOrgnz()
    {
        this._has_eNseqUndOrgnz= false;
    } //-- void deleteENseqUndOrgnz() 

    /**
     * Returns the value of field 'eCchaveSegrcPreft'.
     * 
     * @return String
     * @return the value of field 'eCchaveSegrcPreft'.
     */
    public java.lang.String getECchaveSegrcPreft()
    {
        return this._eCchaveSegrcPreft;
    } //-- java.lang.String getECchaveSegrcPreft() 

    /**
     * Returns the value of field 'eCmunBacen'.
     * 
     * @return long
     * @return the value of field 'eCmunBacen'.
     */
    public long getECmunBacen()
    {
        return this._eCmunBacen;
    } //-- long getECmunBacen() 

    /**
     * Returns the value of field 'eCpssoaJurid'.
     * 
     * @return long
     * @return the value of field 'eCpssoaJurid'.
     */
    public long getECpssoaJurid()
    {
        return this._eCpssoaJurid;
    } //-- long getECpssoaJurid() 

    /**
     * Returns the value of field 'eEurlPreftMun'.
     * 
     * @return String
     * @return the value of field 'eEurlPreftMun'.
     */
    public java.lang.String getEEurlPreftMun()
    {
        return this._eEurlPreftMun;
    } //-- java.lang.String getEEurlPreftMun() 

    /**
     * Returns the value of field 'eNseqUndOrgnz'.
     * 
     * @return int
     * @return the value of field 'eNseqUndOrgnz'.
     */
    public int getENseqUndOrgnz()
    {
        return this._eNseqUndOrgnz;
    } //-- int getENseqUndOrgnz() 

    /**
     * Returns the value of field 'eTipoDeManutenceo'.
     * 
     * @return String
     * @return the value of field 'eTipoDeManutenceo'.
     */
    public java.lang.String getETipoDeManutenceo()
    {
        return this._eTipoDeManutenceo;
    } //-- java.lang.String getETipoDeManutenceo() 

    /**
     * Method hasECmunBacen
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECmunBacen()
    {
        return this._has_eCmunBacen;
    } //-- boolean hasECmunBacen() 

    /**
     * Method hasECpssoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasECpssoaJurid()
    {
        return this._has_eCpssoaJurid;
    } //-- boolean hasECpssoaJurid() 

    /**
     * Method hasENseqUndOrgnz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasENseqUndOrgnz()
    {
        return this._has_eNseqUndOrgnz;
    } //-- boolean hasENseqUndOrgnz() 

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
     * Sets the value of field 'eCchaveSegrcPreft'.
     * 
     * @param eCchaveSegrcPreft the value of field
     * 'eCchaveSegrcPreft'.
     */
    public void setECchaveSegrcPreft(java.lang.String eCchaveSegrcPreft)
    {
        this._eCchaveSegrcPreft = eCchaveSegrcPreft;
    } //-- void setECchaveSegrcPreft(java.lang.String) 

    /**
     * Sets the value of field 'eCmunBacen'.
     * 
     * @param eCmunBacen the value of field 'eCmunBacen'.
     */
    public void setECmunBacen(long eCmunBacen)
    {
        this._eCmunBacen = eCmunBacen;
        this._has_eCmunBacen = true;
    } //-- void setECmunBacen(long) 

    /**
     * Sets the value of field 'eCpssoaJurid'.
     * 
     * @param eCpssoaJurid the value of field 'eCpssoaJurid'.
     */
    public void setECpssoaJurid(long eCpssoaJurid)
    {
        this._eCpssoaJurid = eCpssoaJurid;
        this._has_eCpssoaJurid = true;
    } //-- void setECpssoaJurid(long) 

    /**
     * Sets the value of field 'eEurlPreftMun'.
     * 
     * @param eEurlPreftMun the value of field 'eEurlPreftMun'.
     */
    public void setEEurlPreftMun(java.lang.String eEurlPreftMun)
    {
        this._eEurlPreftMun = eEurlPreftMun;
    } //-- void setEEurlPreftMun(java.lang.String) 

    /**
     * Sets the value of field 'eNseqUndOrgnz'.
     * 
     * @param eNseqUndOrgnz the value of field 'eNseqUndOrgnz'.
     */
    public void setENseqUndOrgnz(int eNseqUndOrgnz)
    {
        this._eNseqUndOrgnz = eNseqUndOrgnz;
        this._has_eNseqUndOrgnz = true;
    } //-- void setENseqUndOrgnz(int) 

    /**
     * Sets the value of field 'eTipoDeManutenceo'.
     * 
     * @param eTipoDeManutenceo the value of field
     * 'eTipoDeManutenceo'.
     */
    public void setETipoDeManutenceo(java.lang.String eTipoDeManutenceo)
    {
        this._eTipoDeManutenceo = eTipoDeManutenceo;
    } //-- void setETipoDeManutenceo(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ParametrizacaoDepIncluirRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.parametrizacaodepincluir.request.ParametrizacaoDepIncluirRequest unmarshal(java.io.Reader) 

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
