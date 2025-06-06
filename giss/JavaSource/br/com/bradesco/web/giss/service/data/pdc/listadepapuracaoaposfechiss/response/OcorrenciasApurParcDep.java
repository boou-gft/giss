/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasApurParcDep.java,v 1.4 2018/04/24 02:27:06 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class OcorrenciasApurParcDep.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/24 02:27:06 $
 */
public class OcorrenciasApurParcDep implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _numeroSequencial
     */
    private int _numeroSequencial = 0;

    /**
     * keeps track of state for field: _numeroSequencial
     */
    private boolean _has_numeroSequencial;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _codPa
     */
    private int _codPa = 0;

    /**
     * keeps track of state for field: _codPa
     */
    private boolean _has_codPa;

    /**
     * Field _descPa
     */
    private java.lang.String _descPa;

    /**
     * Field _sinalRec
     */
    private java.lang.String _sinalRec;

    /**
     * Field _valorRec
     */
    private java.math.BigDecimal _valorRec = new java.math.BigDecimal("0");

    /**
     * Field _sinalIss
     */
    private java.lang.String _sinalIss;

    /**
     * Field _valorIss
     */
    private java.math.BigDecimal _valorIss = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasApurParcDep() 
     {
        super();
        setValorRec(new java.math.BigDecimal("0"));
        setValorIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodPa
     * 
     */
    public void deleteCodPa()
    {
        this._has_codPa= false;
    } //-- void deleteCodPa() 

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteNumeroSequencial
     * 
     */
    public void deleteNumeroSequencial()
    {
        this._has_numeroSequencial= false;
    } //-- void deleteNumeroSequencial() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

    /**
     * Returns the value of field 'codPa'.
     * 
     * @return int
     * @return the value of field 'codPa'.
     */
    public int getCodPa()
    {
        return this._codPa;
    } //-- int getCodPa() 

    /**
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'descPa'.
     * 
     * @return String
     * @return the value of field 'descPa'.
     */
    public java.lang.String getDescPa()
    {
        return this._descPa;
    } //-- java.lang.String getDescPa() 

    /**
     * Returns the value of field 'numeroSequencial'.
     * 
     * @return int
     * @return the value of field 'numeroSequencial'.
     */
    public int getNumeroSequencial()
    {
        return this._numeroSequencial;
    } //-- int getNumeroSequencial() 

    /**
     * Returns the value of field 'sinalIss'.
     * 
     * @return String
     * @return the value of field 'sinalIss'.
     */
    public java.lang.String getSinalIss()
    {
        return this._sinalIss;
    } //-- java.lang.String getSinalIss() 

    /**
     * Returns the value of field 'sinalRec'.
     * 
     * @return String
     * @return the value of field 'sinalRec'.
     */
    public java.lang.String getSinalRec()
    {
        return this._sinalRec;
    } //-- java.lang.String getSinalRec() 

    /**
     * Returns the value of field 'valorIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIss'.
     */
    public java.math.BigDecimal getValorIss()
    {
        return this._valorIss;
    } //-- java.math.BigDecimal getValorIss() 

    /**
     * Returns the value of field 'valorRec'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRec'.
     */
    public java.math.BigDecimal getValorRec()
    {
        return this._valorRec;
    } //-- java.math.BigDecimal getValorRec() 

    /**
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

    /**
     * Method hasCodPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPa()
    {
        return this._has_codPa;
    } //-- boolean hasCodPa() 

    /**
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasNumeroSequencial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencial()
    {
        return this._has_numeroSequencial;
    } //-- boolean hasNumeroSequencial() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

    /**
     * Sets the value of field 'codPa'.
     * 
     * @param codPa the value of field 'codPa'.
     */
    public void setCodPa(int codPa)
    {
        this._codPa = codPa;
        this._has_codPa = true;
    } //-- void setCodPa(int) 

    /**
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descPa'.
     * 
     * @param descPa the value of field 'descPa'.
     */
    public void setDescPa(java.lang.String descPa)
    {
        this._descPa = descPa;
    } //-- void setDescPa(java.lang.String) 

    /**
     * Sets the value of field 'numeroSequencial'.
     * 
     * @param numeroSequencial the value of field 'numeroSequencial'
     */
    public void setNumeroSequencial(int numeroSequencial)
    {
        this._numeroSequencial = numeroSequencial;
        this._has_numeroSequencial = true;
    } //-- void setNumeroSequencial(int) 

    /**
     * Sets the value of field 'sinalIss'.
     * 
     * @param sinalIss the value of field 'sinalIss'.
     */
    public void setSinalIss(java.lang.String sinalIss)
    {
        this._sinalIss = sinalIss;
    } //-- void setSinalIss(java.lang.String) 

    /**
     * Sets the value of field 'sinalRec'.
     * 
     * @param sinalRec the value of field 'sinalRec'.
     */
    public void setSinalRec(java.lang.String sinalRec)
    {
        this._sinalRec = sinalRec;
    } //-- void setSinalRec(java.lang.String) 

    /**
     * Sets the value of field 'valorIss'.
     * 
     * @param valorIss the value of field 'valorIss'.
     */
    public void setValorIss(java.math.BigDecimal valorIss)
    {
        this._valorIss = valorIss;
    } //-- void setValorIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorRec'.
     * 
     * @param valorRec the value of field 'valorRec'.
     */
    public void setValorRec(java.math.BigDecimal valorRec)
    {
        this._valorRec = valorRec;
    } //-- void setValorRec(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasApurParcDep
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.response.OcorrenciasApurParcDep unmarshal(java.io.Reader) 

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
