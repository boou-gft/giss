/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response;

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
 * Class ListaSaida.
 * 
 * @version $Revision$ $Date$
 */
public class ListaSaida implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _uf
     */
    private java.lang.String _uf;

    /**
     * Field _codSitMunicipio
     */
    private int _codSitMunicipio = 0;

    /**
     * keeps track of state for field: _codSitMunicipio
     */
    private boolean _has_codSitMunicipio;

    /**
     * Field _codUsuarioManut
     */
    private java.lang.String _codUsuarioManut;

    /**
     * Field _dataHoraManut
     */
    private java.lang.String _dataHoraManut;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaSaida() 
     {
        super();
    } //-- br.com.bradesco.web.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodSitMunicipio
     * 
     */
    public void deleteCodSitMunicipio()
    {
        this._has_codSitMunicipio= false;
    } //-- void deleteCodSitMunicipio() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codSitMunicipio'.
     * 
     * @return int
     * @return the value of field 'codSitMunicipio'.
     */
    public int getCodSitMunicipio()
    {
        return this._codSitMunicipio;
    } //-- int getCodSitMunicipio() 

    /**
     * Returns the value of field 'codUsuarioManut'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManut'.
     */
    public java.lang.String getCodUsuarioManut()
    {
        return this._codUsuarioManut;
    } //-- java.lang.String getCodUsuarioManut() 

    /**
     * Returns the value of field 'dataHoraManut'.
     * 
     * @return String
     * @return the value of field 'dataHoraManut'.
     */
    public java.lang.String getDataHoraManut()
    {
        return this._dataHoraManut;
    } //-- java.lang.String getDataHoraManut() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'uf'.
     * 
     * @return String
     * @return the value of field 'uf'.
     */
    public java.lang.String getUf()
    {
        return this._uf;
    } //-- java.lang.String getUf() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodSitMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSitMunicipio()
    {
        return this._has_codSitMunicipio;
    } //-- boolean hasCodSitMunicipio() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codSitMunicipio'.
     * 
     * @param codSitMunicipio the value of field 'codSitMunicipio'.
     */
    public void setCodSitMunicipio(int codSitMunicipio)
    {
        this._codSitMunicipio = codSitMunicipio;
        this._has_codSitMunicipio = true;
    } //-- void setCodSitMunicipio(int) 

    /**
     * Sets the value of field 'codUsuarioManut'.
     * 
     * @param codUsuarioManut the value of field 'codUsuarioManut'.
     */
    public void setCodUsuarioManut(java.lang.String codUsuarioManut)
    {
        this._codUsuarioManut = codUsuarioManut;
    } //-- void setCodUsuarioManut(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraManut'.
     * 
     * @param dataHoraManut the value of field 'dataHoraManut'.
     */
    public void setDataHoraManut(java.lang.String dataHoraManut)
    {
        this._dataHoraManut = dataHoraManut;
    } //-- void setDataHoraManut(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'uf'.
     * 
     * @param uf the value of field 'uf'.
     */
    public void setUf(java.lang.String uf)
    {
        this._uf = uf;
    } //-- void setUf(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaSaida
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida.class, reader);
    } //-- br.com.bradesco.web.service.data.pdc.listarmunicipiossemconvenio.response.ListaSaida unmarshal(java.io.Reader) 

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
