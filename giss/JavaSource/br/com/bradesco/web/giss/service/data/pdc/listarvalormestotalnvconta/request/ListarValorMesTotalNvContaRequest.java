/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request;

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
 * Class ListarValorMesTotalNvContaRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarValorMesTotalNvContaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _filtro
     */
    private int _filtro = 0;

    /**
     * keeps track of state for field: _filtro
     */
    private boolean _has_filtro;

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSubGrupo
     */
    private int _codSubGrupo = 0;

    /**
     * keeps track of state for field: _codSubGrupo
     */
    private boolean _has_codSubGrupo;

    /**
     * Field _cosif
     */
    private java.lang.String _cosif;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarValorMesTotalNvContaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

    /**
     * Method deleteCodSubGrupo
     * 
     */
    public void deleteCodSubGrupo()
    {
        this._has_codSubGrupo= false;
    } //-- void deleteCodSubGrupo() 

    /**
     * Method deleteFiltro
     * 
     */
    public void deleteFiltro()
    {
        this._has_filtro= false;
    } //-- void deleteFiltro() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

    /**
     * Returns the value of field 'codSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codSubGrupo'.
     */
    public int getCodSubGrupo()
    {
        return this._codSubGrupo;
    } //-- int getCodSubGrupo() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return String
     * @return the value of field 'cosif'.
     */
    public java.lang.String getCosif()
    {
        return this._cosif;
    } //-- java.lang.String getCosif() 

    /**
     * Returns the value of field 'filtro'.
     * 
     * @return int
     * @return the value of field 'filtro'.
     */
    public int getFiltro()
    {
        return this._filtro;
    } //-- int getFiltro() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

    /**
     * Method hasCodSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubGrupo()
    {
        return this._has_codSubGrupo;
    } //-- boolean hasCodSubGrupo() 

    /**
     * Method hasFiltro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasFiltro()
    {
        return this._has_filtro;
    } //-- boolean hasFiltro() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

    /**
     * Sets the value of field 'codSubGrupo'.
     * 
     * @param codSubGrupo the value of field 'codSubGrupo'.
     */
    public void setCodSubGrupo(int codSubGrupo)
    {
        this._codSubGrupo = codSubGrupo;
        this._has_codSubGrupo = true;
    } //-- void setCodSubGrupo(int) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(java.lang.String cosif)
    {
        this._cosif = cosif;
    } //-- void setCosif(java.lang.String) 

    /**
     * Sets the value of field 'filtro'.
     * 
     * @param filtro the value of field 'filtro'.
     */
    public void setFiltro(int filtro)
    {
        this._filtro = filtro;
        this._has_filtro = true;
    } //-- void setFiltro(int) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarValorMesTotalNvContaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.request.ListarValorMesTotalNvContaRequest unmarshal(java.io.Reader) 

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
