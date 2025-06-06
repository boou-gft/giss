/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaConsultarDep.java,v 1.2 2018/03/12 11:24:02 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response;

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
 * Class ListaConsultarDep.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/03/12 11:24:02 $
 */
public class ListaConsultarDep implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPaa
     */
    private int _codPaa = 0;

    /**
     * keeps track of state for field: _codPaa
     */
    private boolean _has_codPaa;

    /**
     * Field _descPaa
     */
    private java.lang.String _descPaa;

    /**
     * Field _municipio
     */
    private java.lang.String _municipio;

    /**
     * Field _uf
     */
    private java.lang.String _uf;

    /**
     * Field _operacao
     */
    private int _operacao = 0;

    /**
     * keeps track of state for field: _operacao
     */
    private boolean _has_operacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultarDep() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ListaConsultarDep()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodPaa
     * 
     */
    public void deleteCodPaa()
    {
        this._has_codPaa= false;
    } //-- void deleteCodPaa() 

    /**
     * Method deleteOperacao
     * 
     */
    public void deleteOperacao()
    {
        this._has_operacao= false;
    } //-- void deleteOperacao() 

    /**
     * Returns the value of field 'codPaa'.
     * 
     * @return int
     * @return the value of field 'codPaa'.
     */
    public int getCodPaa()
    {
        return this._codPaa;
    } //-- int getCodPaa() 

    /**
     * Returns the value of field 'descPaa'.
     * 
     * @return String
     * @return the value of field 'descPaa'.
     */
    public java.lang.String getDescPaa()
    {
        return this._descPaa;
    } //-- java.lang.String getDescPaa() 

    /**
     * Returns the value of field 'municipio'.
     * 
     * @return String
     * @return the value of field 'municipio'.
     */
    public java.lang.String getMunicipio()
    {
        return this._municipio;
    } //-- java.lang.String getMunicipio() 

    /**
     * Returns the value of field 'operacao'.
     * 
     * @return int
     * @return the value of field 'operacao'.
     */
    public int getOperacao()
    {
        return this._operacao;
    } //-- int getOperacao() 

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
     * Method hasCodPaa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPaa()
    {
        return this._has_codPaa;
    } //-- boolean hasCodPaa() 

    /**
     * Method hasOperacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOperacao()
    {
        return this._has_operacao;
    } //-- boolean hasOperacao() 

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
     * Sets the value of field 'codPaa'.
     * 
     * @param codPaa the value of field 'codPaa'.
     */
    public void setCodPaa(int codPaa)
    {
        this._codPaa = codPaa;
        this._has_codPaa = true;
    } //-- void setCodPaa(int) 

    /**
     * Sets the value of field 'descPaa'.
     * 
     * @param descPaa the value of field 'descPaa'.
     */
    public void setDescPaa(java.lang.String descPaa)
    {
        this._descPaa = descPaa;
    } //-- void setDescPaa(java.lang.String) 

    /**
     * Sets the value of field 'municipio'.
     * 
     * @param municipio the value of field 'municipio'.
     */
    public void setMunicipio(java.lang.String municipio)
    {
        this._municipio = municipio;
    } //-- void setMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'operacao'.
     * 
     * @param operacao the value of field 'operacao'.
     */
    public void setOperacao(int operacao)
    {
        this._operacao = operacao;
        this._has_operacao = true;
    } //-- void setOperacao(int) 

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
     * @return ListaConsultarDep
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ListaConsultarDep unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ListaConsultarDep) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ListaConsultarDep.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.response.ListaConsultarDep unmarshal(java.io.Reader) 

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
