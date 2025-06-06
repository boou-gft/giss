/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request;

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
 * Class ListarPgtosNaoGeradosRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarPgtosNaoGeradosRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _codProduto
     */
    private int _codProduto = 0;

    /**
     * keeps track of state for field: _codProduto
     */
    private boolean _has_codProduto;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;

    /**
     * Field _numeroApuracaoIss
     */
    private int _numeroApuracaoIss = 0;

    /**
     * keeps track of state for field: _numeroApuracaoIss
     */
    private boolean _has_numeroApuracaoIss;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarPgtosNaoGeradosRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodProduto
     * 
     */
    public void deleteCodProduto()
    {
        this._has_codProduto= false;
    } //-- void deleteCodProduto() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteNumeroApuracaoIss
     * 
     */
    public void deleteNumeroApuracaoIss()
    {
        this._has_numeroApuracaoIss= false;
    } //-- void deleteNumeroApuracaoIss() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codProduto'.
     * 
     * @return int
     * @return the value of field 'codProduto'.
     */
    public int getCodProduto()
    {
        return this._codProduto;
    } //-- int getCodProduto() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Returns the value of field 'numeroApuracaoIss'.
     * 
     * @return int
     * @return the value of field 'numeroApuracaoIss'.
     */
    public int getNumeroApuracaoIss()
    {
        return this._numeroApuracaoIss;
    } //-- int getNumeroApuracaoIss() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasCodProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodProduto()
    {
        return this._has_codProduto;
    } //-- boolean hasCodProduto() 

    /**
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

    /**
     * Method hasNumeroApuracaoIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroApuracaoIss()
    {
        return this._has_numeroApuracaoIss;
    } //-- boolean hasNumeroApuracaoIss() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codProduto'.
     * 
     * @param codProduto the value of field 'codProduto'.
     */
    public void setCodProduto(int codProduto)
    {
        this._codProduto = codProduto;
        this._has_codProduto = true;
    } //-- void setCodProduto(int) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Sets the value of field 'numeroApuracaoIss'.
     * 
     * @param numeroApuracaoIss the value of field
     * 'numeroApuracaoIss'.
     */
    public void setNumeroApuracaoIss(int numeroApuracaoIss)
    {
        this._numeroApuracaoIss = numeroApuracaoIss;
        this._has_numeroApuracaoIss = true;
    } //-- void setNumeroApuracaoIss(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarPgtosNaoGeradosRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.request.ListarPgtosNaoGeradosRequest unmarshal(java.io.Reader) 

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
