/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarValoresMesTotalRequest.java,v 1.6 2018/03/12 11:23:59 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request;

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
 * Class ListarValoresMesTotalRequest.
 * 
 * @version $Revision: 1.6 $ $Date: 2018/03/12 11:23:59 $
 */
public class ListarValoresMesTotalRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _nroMaxOcorrencias
     */
    private int _nroMaxOcorrencias = 0;

    /**
     * keeps track of state for field: _nroMaxOcorrencias
     */
    private boolean _has_nroMaxOcorrencias;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _codigoFiltro
     */
    private int _codigoFiltro = 0;

    /**
     * keeps track of state for field: _codigoFiltro
     */
    private boolean _has_codigoFiltro;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarValoresMesTotalRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoFiltro
     * 
     */
    public void deleteCodigoFiltro()
    {
        this._has_codigoFiltro= false;
    } //-- void deleteCodigoFiltro() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNroMaxOcorrencias
     * 
     */
    public void deleteNroMaxOcorrencias()
    {
        this._has_nroMaxOcorrencias= false;
    } //-- void deleteNroMaxOcorrencias() 

    /**
     * Returns the value of field 'codigoFiltro'.
     * 
     * @return int
     * @return the value of field 'codigoFiltro'.
     */
    public int getCodigoFiltro()
    {
        return this._codigoFiltro;
    } //-- int getCodigoFiltro() 

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
     * Returns the value of field 'nroMaxOcorrencias'.
     * 
     * @return int
     * @return the value of field 'nroMaxOcorrencias'.
     */
    public int getNroMaxOcorrencias()
    {
        return this._nroMaxOcorrencias;
    } //-- int getNroMaxOcorrencias() 

    /**
     * Method hasCodigoFiltro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoFiltro()
    {
        return this._has_codigoFiltro;
    } //-- boolean hasCodigoFiltro() 

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
     * Method hasNroMaxOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNroMaxOcorrencias()
    {
        return this._has_nroMaxOcorrencias;
    } //-- boolean hasNroMaxOcorrencias() 

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
     * Sets the value of field 'codigoFiltro'.
     * 
     * @param codigoFiltro the value of field 'codigoFiltro'.
     */
    public void setCodigoFiltro(int codigoFiltro)
    {
        this._codigoFiltro = codigoFiltro;
        this._has_codigoFiltro = true;
    } //-- void setCodigoFiltro(int) 

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
     * Sets the value of field 'nroMaxOcorrencias'.
     * 
     * @param nroMaxOcorrencias the value of field
     * 'nroMaxOcorrencias'.
     */
    public void setNroMaxOcorrencias(int nroMaxOcorrencias)
    {
        this._nroMaxOcorrencias = nroMaxOcorrencias;
        this._has_nroMaxOcorrencias = true;
    } //-- void setNroMaxOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarValoresMesTotalRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.request.ListarValoresMesTotalRequest unmarshal(java.io.Reader) 

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
