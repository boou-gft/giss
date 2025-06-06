/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirTipoIncidenciaRequest.java,v 1.1 2017/04/11 14:09:50 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class IncluirTipoIncidenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:50 $
 */
public class IncluirTipoIncidenciaRequest implements java.io.Serializable {


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
     * Field _descricaoTipoIncidencia
     */
    private java.lang.String _descricaoTipoIncidencia;

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _dataFinalVigencia
     */
    private java.lang.String _dataFinalVigencia;

    /**
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirTipoIncidenciaRequest() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param vOcorrencias
     */
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 99)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 99");
        }
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_ocorrenciasList.size() < 99)) {
            throw new IndexOutOfBoundsException("addOcorrencias has a maximum of 99");
        }
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) 

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Method enumerateOcorrencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorrencias()
    {
        return _ocorrenciasList.elements();
    } //-- java.util.Enumeration enumerateOcorrencias() 

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
     * Returns the value of field 'dataFinalVigencia'.
     * 
     * @return String
     * @return the value of field 'dataFinalVigencia'.
     */
    public java.lang.String getDataFinalVigencia()
    {
        return this._dataFinalVigencia;
    } //-- java.lang.String getDataFinalVigencia() 

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Returns the value of field 'descricaoTipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'descricaoTipoIncidencia'.
     */
    public java.lang.String getDescricaoTipoIncidencia()
    {
        return this._descricaoTipoIncidencia;
    } //-- java.lang.String getDescricaoTipoIncidencia() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[] getOcorrencias() 

    /**
     * Method getOcorrenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasCount()
    {
        return _ocorrenciasList.size();
    } //-- int getOcorrenciasCount() 

    /**
     * Returns the value of field 'quantidadeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencias'.
     */
    public int getQuantidadeOcorrencias()
    {
        return this._quantidadeOcorrencias;
    } //-- int getQuantidadeOcorrencias() 

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
     * Method hasQuantidadeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencias()
    {
        return this._has_quantidadeOcorrencias;
    } //-- boolean hasQuantidadeOcorrencias() 

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
     * Method removeAllOcorrencias
     * 
     */
    public void removeAllOcorrencias()
    {
        _ocorrenciasList.removeAllElements();
    } //-- void removeAllOcorrencias() 

    /**
     * Method removeOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias removeOcorrencias(int) 

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
     * Sets the value of field 'dataFinalVigencia'.
     * 
     * @param dataFinalVigencia the value of field
     * 'dataFinalVigencia'.
     */
    public void setDataFinalVigencia(java.lang.String dataFinalVigencia)
    {
        this._dataFinalVigencia = dataFinalVigencia;
    } //-- void setDataFinalVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'descricaoTipoIncidencia'.
     * 
     * @param descricaoTipoIncidencia the value of field
     * 'descricaoTipoIncidencia'.
     */
    public void setDescricaoTipoIncidencia(java.lang.String descricaoTipoIncidencia)
    {
        this._descricaoTipoIncidencia = descricaoTipoIncidencia;
    } //-- void setDescricaoTipoIncidencia(java.lang.String) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        if (!(index < 99)) {
            throw new IndexOutOfBoundsException("setOcorrencias has a maximum of 99");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.Ocorrencias) 

    /**
     * Sets the value of field 'quantidadeOcorrencias'.
     * 
     * @param quantidadeOcorrencias the value of field
     * 'quantidadeOcorrencias'.
     */
    public void setQuantidadeOcorrencias(int quantidadeOcorrencias)
    {
        this._quantidadeOcorrencias = quantidadeOcorrencias;
        this._has_quantidadeOcorrencias = true;
    } //-- void setQuantidadeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirTipoIncidenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.request.IncluirTipoIncidenciaRequest unmarshal(java.io.Reader) 

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
