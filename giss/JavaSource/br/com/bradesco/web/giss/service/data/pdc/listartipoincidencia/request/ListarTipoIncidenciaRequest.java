/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarTipoIncidenciaRequest.java,v 1.2 2017/07/25 18:15:18 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request;

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
 * Class ListarTipoIncidenciaRequest.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/25 18:15:18 $
 */
public class ListarTipoIncidenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoTipoIncidencia
     */
    private int _codigoTipoIncidencia = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidencia
     */
    private boolean _has_codigoTipoIncidencia;

    /**
     * Field _descricao
     */
    private java.lang.String _descricao;

    /**
     * Field _funcao
     */
    private java.lang.String _funcao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarTipoIncidenciaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public int getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- int getCodigoTipoIncidencia() 

    /**
     * Returns the value of field 'descricao'.
     * 
     * @return String
     * @return the value of field 'descricao'.
     */
    public java.lang.String getDescricao()
    {
        return this._descricao;
    } //-- java.lang.String getDescricao() 

    /**
     * Returns the value of field 'funcao'.
     * 
     * @return String
     * @return the value of field 'funcao'.
     */
    public java.lang.String getFuncao()
    {
        return this._funcao;
    } //-- java.lang.String getFuncao() 

    /**
     * Method hasCodigoTipoIncidencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidencia()
    {
        return this._has_codigoTipoIncidencia;
    } //-- boolean hasCodigoTipoIncidencia() 

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
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(int codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
        this._has_codigoTipoIncidencia = true;
    } //-- void setCodigoTipoIncidencia(int) 

    /**
     * Sets the value of field 'descricao'.
     * 
     * @param descricao the value of field 'descricao'.
     */
    public void setDescricao(java.lang.String descricao)
    {
        this._descricao = descricao;
    } //-- void setDescricao(java.lang.String) 

    /**
     * Sets the value of field 'funcao'.
     * 
     * @param funcao the value of field 'funcao'.
     */
    public void setFuncao(java.lang.String funcao)
    {
        this._funcao = funcao;
    } //-- void setFuncao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarTipoIncidenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.request.ListarTipoIncidenciaRequest unmarshal(java.io.Reader) 

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
