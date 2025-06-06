/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoParcialDependenciaResponse.java,v 1.3 2018/04/24 02:27:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarApuracaoParcialDependenciaResponse.
 * 
 * @version $Revision: 1.3 $ $Date: 2018/04/24 02:27:07 $
 */
public class ListarApuracaoParcialDependenciaResponse implements java.io.Serializable {


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
     * Field _quantidadeOcorrencias
     */
    private int _quantidadeOcorrencias = 0;

    /**
     * keeps track of state for field: _quantidadeOcorrencias
     */
    private boolean _has_quantidadeOcorrencias;

    /**
     * Field _sinalReceitaGeral
     */
    private java.lang.String _sinalReceitaGeral;

    /**
     * Field _valorReceitaGeral
     */
    private java.math.BigDecimal _valorReceitaGeral = new java.math.BigDecimal("0");

    /**
     * Field _sinalISSGeral
     */
    private java.lang.String _sinalISSGeral;

    /**
     * Field _valorISSGeral
     */
    private java.math.BigDecimal _valorISSGeral = new java.math.BigDecimal("0");

    /**
     * Field _sinalReceitaGeralPa
     */
    private java.lang.String _sinalReceitaGeralPa;

    /**
     * Field _valorReceitaGeralPa
     */
    private java.math.BigDecimal _valorReceitaGeralPa = new java.math.BigDecimal("0");

    /**
     * Field _sinalISSGeralPa
     */
    private java.lang.String _sinalISSGeralPa;

    /**
     * Field _valorISSGeralPa
     */
    private java.math.BigDecimal _valorISSGeralPa = new java.math.BigDecimal("0");

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
     * Field _codUf
     */
    private java.lang.String _codUf;

    /**
     * Field _descUf
     */
    private java.lang.String _descUf;

    /**
     * Field _listaApuracaoParcialDependenciaList
     */
    private java.util.Vector _listaApuracaoParcialDependenciaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoParcialDependenciaResponse() 
     {
        super();
        setValorReceitaGeral(new java.math.BigDecimal("0"));
        setValorISSGeral(new java.math.BigDecimal("0"));
        setValorReceitaGeralPa(new java.math.BigDecimal("0"));
        setValorISSGeralPa(new java.math.BigDecimal("0"));
        _listaApuracaoParcialDependenciaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param vListaApuracaoParcialDependencia
     */
    public void addListaApuracaoParcialDependencia(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia vListaApuracaoParcialDependencia)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaApuracaoParcialDependenciaList.addElement(vListaApuracaoParcialDependencia);
    } //-- void addListaApuracaoParcialDependencia(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) 

    /**
     * Method addListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoParcialDependencia
     */
    public void addListaApuracaoParcialDependencia(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia vListaApuracaoParcialDependencia)
        throws java.lang.IndexOutOfBoundsException
    {
        _listaApuracaoParcialDependenciaList.insertElementAt(vListaApuracaoParcialDependencia, index);
    } //-- void addListaApuracaoParcialDependencia(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteQuantidadeOcorrencias
     * 
     */
    public void deleteQuantidadeOcorrencias()
    {
        this._has_quantidadeOcorrencias= false;
    } //-- void deleteQuantidadeOcorrencias() 

    /**
     * Method enumerateListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaApuracaoParcialDependencia()
    {
        return _listaApuracaoParcialDependenciaList.elements();
    } //-- java.util.Enumeration enumerateListaApuracaoParcialDependencia() 

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
     * Returns the value of field 'codUf'.
     * 
     * @return String
     * @return the value of field 'codUf'.
     */
    public java.lang.String getCodUf()
    {
        return this._codUf;
    } //-- java.lang.String getCodUf() 

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
     * Returns the value of field 'descUf'.
     * 
     * @return String
     * @return the value of field 'descUf'.
     */
    public java.lang.String getDescUf()
    {
        return this._descUf;
    } //-- java.lang.String getDescUf() 

    /**
     * Method getListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoParcialDependencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia getListaApuracaoParcialDependencia(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoParcialDependenciaList.size())) {
            throw new IndexOutOfBoundsException("getListaApuracaoParcialDependencia: Index value '"+index+"' not in range [0.."+(_listaApuracaoParcialDependenciaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) _listaApuracaoParcialDependenciaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia getListaApuracaoParcialDependencia(int) 

    /**
     * Method getListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @return ListaApuracaoParcialDependencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia[] getListaApuracaoParcialDependencia()
    {
        int size = _listaApuracaoParcialDependenciaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) _listaApuracaoParcialDependenciaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia[] getListaApuracaoParcialDependencia() 

    /**
     * Method getListaApuracaoParcialDependenciaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaApuracaoParcialDependenciaCount()
    {
        return _listaApuracaoParcialDependenciaList.size();
    } //-- int getListaApuracaoParcialDependenciaCount() 

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
     * Returns the value of field 'sinalISSGeral'.
     * 
     * @return String
     * @return the value of field 'sinalISSGeral'.
     */
    public java.lang.String getSinalISSGeral()
    {
        return this._sinalISSGeral;
    } //-- java.lang.String getSinalISSGeral() 

    /**
     * Returns the value of field 'sinalISSGeralPa'.
     * 
     * @return String
     * @return the value of field 'sinalISSGeralPa'.
     */
    public java.lang.String getSinalISSGeralPa()
    {
        return this._sinalISSGeralPa;
    } //-- java.lang.String getSinalISSGeralPa() 

    /**
     * Returns the value of field 'sinalReceitaGeral'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaGeral'.
     */
    public java.lang.String getSinalReceitaGeral()
    {
        return this._sinalReceitaGeral;
    } //-- java.lang.String getSinalReceitaGeral() 

    /**
     * Returns the value of field 'sinalReceitaGeralPa'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaGeralPa'.
     */
    public java.lang.String getSinalReceitaGeralPa()
    {
        return this._sinalReceitaGeralPa;
    } //-- java.lang.String getSinalReceitaGeralPa() 

    /**
     * Returns the value of field 'valorISSGeral'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorISSGeral'.
     */
    public java.math.BigDecimal getValorISSGeral()
    {
        return this._valorISSGeral;
    } //-- java.math.BigDecimal getValorISSGeral() 

    /**
     * Returns the value of field 'valorISSGeralPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorISSGeralPa'.
     */
    public java.math.BigDecimal getValorISSGeralPa()
    {
        return this._valorISSGeralPa;
    } //-- java.math.BigDecimal getValorISSGeralPa() 

    /**
     * Returns the value of field 'valorReceitaGeral'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaGeral'.
     */
    public java.math.BigDecimal getValorReceitaGeral()
    {
        return this._valorReceitaGeral;
    } //-- java.math.BigDecimal getValorReceitaGeral() 

    /**
     * Returns the value of field 'valorReceitaGeralPa'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaGeralPa'.
     */
    public java.math.BigDecimal getValorReceitaGeralPa()
    {
        return this._valorReceitaGeralPa;
    } //-- java.math.BigDecimal getValorReceitaGeralPa() 

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
     * Method removeAllListaApuracaoParcialDependencia
     * 
     */
    public void removeAllListaApuracaoParcialDependencia()
    {
        _listaApuracaoParcialDependenciaList.removeAllElements();
    } //-- void removeAllListaApuracaoParcialDependencia() 

    /**
     * Method removeListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param index
     * @return ListaApuracaoParcialDependencia
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia removeListaApuracaoParcialDependencia(int index)
    {
        java.lang.Object obj = _listaApuracaoParcialDependenciaList.elementAt(index);
        _listaApuracaoParcialDependenciaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia removeListaApuracaoParcialDependencia(int) 

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
     * Sets the value of field 'codUf'.
     * 
     * @param codUf the value of field 'codUf'.
     */
    public void setCodUf(java.lang.String codUf)
    {
        this._codUf = codUf;
    } //-- void setCodUf(java.lang.String) 

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
     * Sets the value of field 'descUf'.
     * 
     * @param descUf the value of field 'descUf'.
     */
    public void setDescUf(java.lang.String descUf)
    {
        this._descUf = descUf;
    } //-- void setDescUf(java.lang.String) 

    /**
     * Method setListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param index
     * @param vListaApuracaoParcialDependencia
     */
    public void setListaApuracaoParcialDependencia(int index, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia vListaApuracaoParcialDependencia)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaApuracaoParcialDependenciaList.size())) {
            throw new IndexOutOfBoundsException("setListaApuracaoParcialDependencia: Index value '"+index+"' not in range [0.." + (_listaApuracaoParcialDependenciaList.size() - 1) + "]");
        }
        _listaApuracaoParcialDependenciaList.setElementAt(vListaApuracaoParcialDependencia, index);
    } //-- void setListaApuracaoParcialDependencia(int, br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) 

    /**
     * Method setListaApuracaoParcialDependencia
     * 
     * 
     * 
     * @param listaApuracaoParcialDependenciaArray
     */
    public void setListaApuracaoParcialDependencia(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia[] listaApuracaoParcialDependenciaArray)
    {
        //-- copy array
        _listaApuracaoParcialDependenciaList.removeAllElements();
        for (int i = 0; i < listaApuracaoParcialDependenciaArray.length; i++) {
            _listaApuracaoParcialDependenciaList.addElement(listaApuracaoParcialDependenciaArray[i]);
        }
    } //-- void setListaApuracaoParcialDependencia(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) 

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
     * Sets the value of field 'sinalISSGeral'.
     * 
     * @param sinalISSGeral the value of field 'sinalISSGeral'.
     */
    public void setSinalISSGeral(java.lang.String sinalISSGeral)
    {
        this._sinalISSGeral = sinalISSGeral;
    } //-- void setSinalISSGeral(java.lang.String) 

    /**
     * Sets the value of field 'sinalISSGeralPa'.
     * 
     * @param sinalISSGeralPa the value of field 'sinalISSGeralPa'.
     */
    public void setSinalISSGeralPa(java.lang.String sinalISSGeralPa)
    {
        this._sinalISSGeralPa = sinalISSGeralPa;
    } //-- void setSinalISSGeralPa(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaGeral'.
     * 
     * @param sinalReceitaGeral the value of field
     * 'sinalReceitaGeral'.
     */
    public void setSinalReceitaGeral(java.lang.String sinalReceitaGeral)
    {
        this._sinalReceitaGeral = sinalReceitaGeral;
    } //-- void setSinalReceitaGeral(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaGeralPa'.
     * 
     * @param sinalReceitaGeralPa the value of field
     * 'sinalReceitaGeralPa'.
     */
    public void setSinalReceitaGeralPa(java.lang.String sinalReceitaGeralPa)
    {
        this._sinalReceitaGeralPa = sinalReceitaGeralPa;
    } //-- void setSinalReceitaGeralPa(java.lang.String) 

    /**
     * Sets the value of field 'valorISSGeral'.
     * 
     * @param valorISSGeral the value of field 'valorISSGeral'.
     */
    public void setValorISSGeral(java.math.BigDecimal valorISSGeral)
    {
        this._valorISSGeral = valorISSGeral;
    } //-- void setValorISSGeral(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorISSGeralPa'.
     * 
     * @param valorISSGeralPa the value of field 'valorISSGeralPa'.
     */
    public void setValorISSGeralPa(java.math.BigDecimal valorISSGeralPa)
    {
        this._valorISSGeralPa = valorISSGeralPa;
    } //-- void setValorISSGeralPa(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaGeral'.
     * 
     * @param valorReceitaGeral the value of field
     * 'valorReceitaGeral'.
     */
    public void setValorReceitaGeral(java.math.BigDecimal valorReceitaGeral)
    {
        this._valorReceitaGeral = valorReceitaGeral;
    } //-- void setValorReceitaGeral(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaGeralPa'.
     * 
     * @param valorReceitaGeralPa the value of field
     * 'valorReceitaGeralPa'.
     */
    public void setValorReceitaGeralPa(java.math.BigDecimal valorReceitaGeralPa)
    {
        this._valorReceitaGeralPa = valorReceitaGeralPa;
    } //-- void setValorReceitaGeralPa(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoParcialDependenciaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListarApuracaoParcialDependenciaResponse unmarshal(java.io.Reader) 

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
