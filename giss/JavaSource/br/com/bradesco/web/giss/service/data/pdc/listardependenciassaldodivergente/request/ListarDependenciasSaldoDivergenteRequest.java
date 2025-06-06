/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarDependenciasSaldoDivergenteRequest.java,v 1.1 2017/04/11 14:12:39 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request;

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
 * Class ListarDependenciasSaldoDivergenteRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:39 $
 */
public class ListarDependenciasSaldoDivergenteRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencias
     */
    private int _numeroMaximoOcorrencias = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencias
     */
    private boolean _has_numeroMaximoOcorrencias;

    /**
     * Field _codigoContaContabil
     */
    private long _codigoContaContabil = 0;

    /**
     * keeps track of state for field: _codigoContaContabil
     */
    private boolean _has_codigoContaContabil;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciasSaldoDivergenteRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoContaContabil
     * 
     */
    public void deleteCodigoContaContabil()
    {
        this._has_codigoContaContabil= false;
    } //-- void deleteCodigoContaContabil() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Method deleteNumeroMaximoOcorrencias
     * 
     */
    public void deleteNumeroMaximoOcorrencias()
    {
        this._has_numeroMaximoOcorrencias= false;
    } //-- void deleteNumeroMaximoOcorrencias() 

    /**
     * Returns the value of field 'codigoContaContabil'.
     * 
     * @return long
     * @return the value of field 'codigoContaContabil'.
     */
    public long getCodigoContaContabil()
    {
        return this._codigoContaContabil;
    } //-- long getCodigoContaContabil() 

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
     * Returns the value of field 'numeroMaximoOcorrencias'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencias'.
     */
    public int getNumeroMaximoOcorrencias()
    {
        return this._numeroMaximoOcorrencias;
    } //-- int getNumeroMaximoOcorrencias() 

    /**
     * Method hasCodigoContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoContaContabil()
    {
        return this._has_codigoContaContabil;
    } //-- boolean hasCodigoContaContabil() 

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
     * Method hasNumeroMaximoOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencias()
    {
        return this._has_numeroMaximoOcorrencias;
    } //-- boolean hasNumeroMaximoOcorrencias() 

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
     * Sets the value of field 'codigoContaContabil'.
     * 
     * @param codigoContaContabil the value of field
     * 'codigoContaContabil'.
     */
    public void setCodigoContaContabil(long codigoContaContabil)
    {
        this._codigoContaContabil = codigoContaContabil;
        this._has_codigoContaContabil = true;
    } //-- void setCodigoContaContabil(long) 

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
     * Sets the value of field 'numeroMaximoOcorrencias'.
     * 
     * @param numeroMaximoOcorrencias the value of field
     * 'numeroMaximoOcorrencias'.
     */
    public void setNumeroMaximoOcorrencias(int numeroMaximoOcorrencias)
    {
        this._numeroMaximoOcorrencias = numeroMaximoOcorrencias;
        this._has_numeroMaximoOcorrencias = true;
    } //-- void setNumeroMaximoOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDependenciasSaldoDivergenteRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.request.ListarDependenciasSaldoDivergenteRequest unmarshal(java.io.Reader) 

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
