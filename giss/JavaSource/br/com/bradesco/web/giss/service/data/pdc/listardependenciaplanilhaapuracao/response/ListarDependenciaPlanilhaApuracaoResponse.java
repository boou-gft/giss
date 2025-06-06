/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response;

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
 * Class ListarDependenciaPlanilhaApuracaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDependenciaPlanilhaApuracaoResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _periodoInicio
     */
    private int _periodoInicio = 0;

    /**
     * keeps track of state for field: _periodoInicio
     */
    private boolean _has_periodoInicio;

    /**
     * Field _periodoFim
     */
    private int _periodoFim = 0;

    /**
     * keeps track of state for field: _periodoFim
     */
    private boolean _has_periodoFim;

    /**
     * Field _quantidadeOcorrencia
     */
    private int _quantidadeOcorrencia = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencia
     */
    private boolean _has_quantidadeOcorrencia;

    /**
     * Field _qtdeAgencia
     */
    private long _qtdeAgencia = 0;

    /**
     * keeps track of state for field: _qtdeAgencia
     */
    private boolean _has_qtdeAgencia;

    /**
     * Field _qtdePa
     */
    private long _qtdePa = 0;

    /**
     * keeps track of state for field: _qtdePa
     */
    private boolean _has_qtdePa;

    /**
     * Field _ocorrenciasList
     */
    private java.util.Vector _ocorrenciasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciaPlanilhaApuracaoResponse() 
     {
        super();
        _ocorrenciasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse()


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
    public void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.addElement(vOcorrencias);
    } //-- void addOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) 

    /**
     * Method addOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void addOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasList.insertElementAt(vOcorrencias, index);
    } //-- void addOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) 

    /**
     * Method deletePeriodoFim
     * 
     */
    public void deletePeriodoFim()
    {
        this._has_periodoFim= false;
    } //-- void deletePeriodoFim() 

    /**
     * Method deletePeriodoInicio
     * 
     */
    public void deletePeriodoInicio()
    {
        this._has_periodoInicio= false;
    } //-- void deletePeriodoInicio() 

    /**
     * Method deleteQtdeAgencia
     * 
     */
    public void deleteQtdeAgencia()
    {
        this._has_qtdeAgencia= false;
    } //-- void deleteQtdeAgencia() 

    /**
     * Method deleteQtdePa
     * 
     */
    public void deleteQtdePa()
    {
        this._has_qtdePa= false;
    } //-- void deleteQtdePa() 

    /**
     * Method deleteQuantidadeOcorrencia
     * 
     */
    public void deleteQuantidadeOcorrencia()
    {
        this._has_quantidadeOcorrencia= false;
    } //-- void deleteQuantidadeOcorrencia() 

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
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @param index
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias getOcorrencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrencias: Index value '"+index+"' not in range [0.."+(_ocorrenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) _ocorrenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias getOcorrencias(int) 

    /**
     * Method getOcorrencias
     * 
     * 
     * 
     * @return Ocorrencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias[] getOcorrencias()
    {
        int size = _ocorrenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) _ocorrenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias[] getOcorrencias() 

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
     * Returns the value of field 'periodoFim'.
     * 
     * @return int
     * @return the value of field 'periodoFim'.
     */
    public int getPeriodoFim()
    {
        return this._periodoFim;
    } //-- int getPeriodoFim() 

    /**
     * Returns the value of field 'periodoInicio'.
     * 
     * @return int
     * @return the value of field 'periodoInicio'.
     */
    public int getPeriodoInicio()
    {
        return this._periodoInicio;
    } //-- int getPeriodoInicio() 

    /**
     * Returns the value of field 'qtdeAgencia'.
     * 
     * @return long
     * @return the value of field 'qtdeAgencia'.
     */
    public long getQtdeAgencia()
    {
        return this._qtdeAgencia;
    } //-- long getQtdeAgencia() 

    /**
     * Returns the value of field 'qtdePa'.
     * 
     * @return long
     * @return the value of field 'qtdePa'.
     */
    public long getQtdePa()
    {
        return this._qtdePa;
    } //-- long getQtdePa() 

    /**
     * Returns the value of field 'quantidadeOcorrencia'.
     * 
     * @return int
     * @return the value of field 'quantidadeOcorrencia'.
     */
    public int getQuantidadeOcorrencia()
    {
        return this._quantidadeOcorrencia;
    } //-- int getQuantidadeOcorrencia() 

    /**
     * Method hasPeriodoFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPeriodoFim()
    {
        return this._has_periodoFim;
    } //-- boolean hasPeriodoFim() 

    /**
     * Method hasPeriodoInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPeriodoInicio()
    {
        return this._has_periodoInicio;
    } //-- boolean hasPeriodoInicio() 

    /**
     * Method hasQtdeAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeAgencia()
    {
        return this._has_qtdeAgencia;
    } //-- boolean hasQtdeAgencia() 

    /**
     * Method hasQtdePa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdePa()
    {
        return this._has_qtdePa;
    } //-- boolean hasQtdePa() 

    /**
     * Method hasQuantidadeOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeOcorrencia()
    {
        return this._has_quantidadeOcorrencia;
    } //-- boolean hasQuantidadeOcorrencia() 

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
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias removeOcorrencias(int index)
    {
        java.lang.Object obj = _ocorrenciasList.elementAt(index);
        _ocorrenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias removeOcorrencias(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param index
     * @param vOcorrencias
     */
    public void setOcorrencias(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias vOcorrencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrencias: Index value '"+index+"' not in range [0.." + (_ocorrenciasList.size() - 1) + "]");
        }
        _ocorrenciasList.setElementAt(vOcorrencias, index);
    } //-- void setOcorrencias(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) 

    /**
     * Method setOcorrencias
     * 
     * 
     * 
     * @param ocorrenciasArray
     */
    public void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias[] ocorrenciasArray)
    {
        //-- copy array
        _ocorrenciasList.removeAllElements();
        for (int i = 0; i < ocorrenciasArray.length; i++) {
            _ocorrenciasList.addElement(ocorrenciasArray[i]);
        }
    } //-- void setOcorrencias(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.Ocorrencias) 

    /**
     * Sets the value of field 'periodoFim'.
     * 
     * @param periodoFim the value of field 'periodoFim'.
     */
    public void setPeriodoFim(int periodoFim)
    {
        this._periodoFim = periodoFim;
        this._has_periodoFim = true;
    } //-- void setPeriodoFim(int) 

    /**
     * Sets the value of field 'periodoInicio'.
     * 
     * @param periodoInicio the value of field 'periodoInicio'.
     */
    public void setPeriodoInicio(int periodoInicio)
    {
        this._periodoInicio = periodoInicio;
        this._has_periodoInicio = true;
    } //-- void setPeriodoInicio(int) 

    /**
     * Sets the value of field 'qtdeAgencia'.
     * 
     * @param qtdeAgencia the value of field 'qtdeAgencia'.
     */
    public void setQtdeAgencia(long qtdeAgencia)
    {
        this._qtdeAgencia = qtdeAgencia;
        this._has_qtdeAgencia = true;
    } //-- void setQtdeAgencia(long) 

    /**
     * Sets the value of field 'qtdePa'.
     * 
     * @param qtdePa the value of field 'qtdePa'.
     */
    public void setQtdePa(long qtdePa)
    {
        this._qtdePa = qtdePa;
        this._has_qtdePa = true;
    } //-- void setQtdePa(long) 

    /**
     * Sets the value of field 'quantidadeOcorrencia'.
     * 
     * @param quantidadeOcorrencia the value of field
     * 'quantidadeOcorrencia'.
     */
    public void setQuantidadeOcorrencia(int quantidadeOcorrencia)
    {
        this._quantidadeOcorrencia = quantidadeOcorrencia;
        this._has_quantidadeOcorrencia = true;
    } //-- void setQuantidadeOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDependenciaPlanilhaApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.response.ListarDependenciaPlanilhaApuracaoResponse unmarshal(java.io.Reader) 

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
