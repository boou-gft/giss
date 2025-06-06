/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: SolicitarReprocessamentoPorMunicipioRequest.java,v 1.1 2017/04/11 14:11:56 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request;

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
 * Class SolicitarReprocessamentoPorMunicipioRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:56 $
 */
public class SolicitarReprocessamentoPorMunicipioRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoEstado
     */
    private int _codigoEstado = 0;

    /**
     * keeps track of state for field: _codigoEstado
     */
    private boolean _has_codigoEstado;

    /**
     * Field _competenciaInicial
     */
    private int _competenciaInicial = 0;

    /**
     * keeps track of state for field: _competenciaInicial
     */
    private boolean _has_competenciaInicial;

    /**
     * Field _competenciaFinal
     */
    private int _competenciaFinal = 0;

    /**
     * keeps track of state for field: _competenciaFinal
     */
    private boolean _has_competenciaFinal;

    /**
     * Field _usuario
     */
    private java.lang.String _usuario;

    /**
     * Field _criterioSelecao
     */
    private java.lang.String _criterioSelecao;

    /**
     * Field _municipiosList
     */
    private java.util.Vector _municipiosList;

    /**
     * Field _tipoUsuario
     */
    private java.lang.String _tipoUsuario;

    /**
     * Field _usuarioCanal
     */
    private java.lang.String _usuarioCanal;

    /**
     * Field _codigoCanal
     */
    private int _codigoCanal = 0;

    /**
     * keeps track of state for field: _codigoCanal
     */
    private boolean _has_codigoCanal;

    /**
     * Field _terminal
     */
    private java.lang.String _terminal;


      //----------------/
     //- Constructors -/
    //----------------/

    public SolicitarReprocessamentoPorMunicipioRequest() 
     {
        super();
        _municipiosList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addMunicipios
     * 
     * 
     * 
     * @param vMunicipios
     */
    public void addMunicipios(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios vMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_municipiosList.size() < 720)) {
            throw new IndexOutOfBoundsException("addMunicipios has a maximum of 720");
        }
        _municipiosList.addElement(vMunicipios);
    } //-- void addMunicipios(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) 

    /**
     * Method addMunicipios
     * 
     * 
     * 
     * @param index
     * @param vMunicipios
     */
    public void addMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios vMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_municipiosList.size() < 720)) {
            throw new IndexOutOfBoundsException("addMunicipios has a maximum of 720");
        }
        _municipiosList.insertElementAt(vMunicipios, index);
    } //-- void addMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) 

    /**
     * Method deleteCodigoCanal
     * 
     */
    public void deleteCodigoCanal()
    {
        this._has_codigoCanal= false;
    } //-- void deleteCodigoCanal() 

    /**
     * Method deleteCodigoEstado
     * 
     */
    public void deleteCodigoEstado()
    {
        this._has_codigoEstado= false;
    } //-- void deleteCodigoEstado() 

    /**
     * Method deleteCompetenciaFinal
     * 
     */
    public void deleteCompetenciaFinal()
    {
        this._has_competenciaFinal= false;
    } //-- void deleteCompetenciaFinal() 

    /**
     * Method deleteCompetenciaInicial
     * 
     */
    public void deleteCompetenciaInicial()
    {
        this._has_competenciaInicial= false;
    } //-- void deleteCompetenciaInicial() 

    /**
     * Method enumerateMunicipios
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateMunicipios()
    {
        return _municipiosList.elements();
    } //-- java.util.Enumeration enumerateMunicipios() 

    /**
     * Returns the value of field 'codigoCanal'.
     * 
     * @return int
     * @return the value of field 'codigoCanal'.
     */
    public int getCodigoCanal()
    {
        return this._codigoCanal;
    } //-- int getCodigoCanal() 

    /**
     * Returns the value of field 'codigoEstado'.
     * 
     * @return int
     * @return the value of field 'codigoEstado'.
     */
    public int getCodigoEstado()
    {
        return this._codigoEstado;
    } //-- int getCodigoEstado() 

    /**
     * Returns the value of field 'competenciaFinal'.
     * 
     * @return int
     * @return the value of field 'competenciaFinal'.
     */
    public int getCompetenciaFinal()
    {
        return this._competenciaFinal;
    } //-- int getCompetenciaFinal() 

    /**
     * Returns the value of field 'competenciaInicial'.
     * 
     * @return int
     * @return the value of field 'competenciaInicial'.
     */
    public int getCompetenciaInicial()
    {
        return this._competenciaInicial;
    } //-- int getCompetenciaInicial() 

    /**
     * Returns the value of field 'criterioSelecao'.
     * 
     * @return String
     * @return the value of field 'criterioSelecao'.
     */
    public java.lang.String getCriterioSelecao()
    {
        return this._criterioSelecao;
    } //-- java.lang.String getCriterioSelecao() 

    /**
     * Method getMunicipios
     * 
     * 
     * 
     * @param index
     * @return Municipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios getMunicipios(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _municipiosList.size())) {
            throw new IndexOutOfBoundsException("getMunicipios: Index value '"+index+"' not in range [0.."+(_municipiosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) _municipiosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios getMunicipios(int) 

    /**
     * Method getMunicipios
     * 
     * 
     * 
     * @return Municipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios[] getMunicipios()
    {
        int size = _municipiosList.size();
        br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios[] mArray = new br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) _municipiosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios[] getMunicipios() 

    /**
     * Method getMunicipiosCount
     * 
     * 
     * 
     * @return int
     */
    public int getMunicipiosCount()
    {
        return _municipiosList.size();
    } //-- int getMunicipiosCount() 

    /**
     * Returns the value of field 'terminal'.
     * 
     * @return String
     * @return the value of field 'terminal'.
     */
    public java.lang.String getTerminal()
    {
        return this._terminal;
    } //-- java.lang.String getTerminal() 

    /**
     * Returns the value of field 'tipoUsuario'.
     * 
     * @return String
     * @return the value of field 'tipoUsuario'.
     */
    public java.lang.String getTipoUsuario()
    {
        return this._tipoUsuario;
    } //-- java.lang.String getTipoUsuario() 

    /**
     * Returns the value of field 'usuario'.
     * 
     * @return String
     * @return the value of field 'usuario'.
     */
    public java.lang.String getUsuario()
    {
        return this._usuario;
    } //-- java.lang.String getUsuario() 

    /**
     * Returns the value of field 'usuarioCanal'.
     * 
     * @return String
     * @return the value of field 'usuarioCanal'.
     */
    public java.lang.String getUsuarioCanal()
    {
        return this._usuarioCanal;
    } //-- java.lang.String getUsuarioCanal() 

    /**
     * Method hasCodigoCanal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCanal()
    {
        return this._has_codigoCanal;
    } //-- boolean hasCodigoCanal() 

    /**
     * Method hasCodigoEstado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoEstado()
    {
        return this._has_codigoEstado;
    } //-- boolean hasCodigoEstado() 

    /**
     * Method hasCompetenciaFinal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetenciaFinal()
    {
        return this._has_competenciaFinal;
    } //-- boolean hasCompetenciaFinal() 

    /**
     * Method hasCompetenciaInicial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetenciaInicial()
    {
        return this._has_competenciaInicial;
    } //-- boolean hasCompetenciaInicial() 

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
     * Method removeAllMunicipios
     * 
     */
    public void removeAllMunicipios()
    {
        _municipiosList.removeAllElements();
    } //-- void removeAllMunicipios() 

    /**
     * Method removeMunicipios
     * 
     * 
     * 
     * @param index
     * @return Municipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios removeMunicipios(int index)
    {
        java.lang.Object obj = _municipiosList.elementAt(index);
        _municipiosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios removeMunicipios(int) 

    /**
     * Sets the value of field 'codigoCanal'.
     * 
     * @param codigoCanal the value of field 'codigoCanal'.
     */
    public void setCodigoCanal(int codigoCanal)
    {
        this._codigoCanal = codigoCanal;
        this._has_codigoCanal = true;
    } //-- void setCodigoCanal(int) 

    /**
     * Sets the value of field 'codigoEstado'.
     * 
     * @param codigoEstado the value of field 'codigoEstado'.
     */
    public void setCodigoEstado(int codigoEstado)
    {
        this._codigoEstado = codigoEstado;
        this._has_codigoEstado = true;
    } //-- void setCodigoEstado(int) 

    /**
     * Sets the value of field 'competenciaFinal'.
     * 
     * @param competenciaFinal the value of field 'competenciaFinal'
     */
    public void setCompetenciaFinal(int competenciaFinal)
    {
        this._competenciaFinal = competenciaFinal;
        this._has_competenciaFinal = true;
    } //-- void setCompetenciaFinal(int) 

    /**
     * Sets the value of field 'competenciaInicial'.
     * 
     * @param competenciaInicial the value of field
     * 'competenciaInicial'.
     */
    public void setCompetenciaInicial(int competenciaInicial)
    {
        this._competenciaInicial = competenciaInicial;
        this._has_competenciaInicial = true;
    } //-- void setCompetenciaInicial(int) 

    /**
     * Sets the value of field 'criterioSelecao'.
     * 
     * @param criterioSelecao the value of field 'criterioSelecao'.
     */
    public void setCriterioSelecao(java.lang.String criterioSelecao)
    {
        this._criterioSelecao = criterioSelecao;
    } //-- void setCriterioSelecao(java.lang.String) 

    /**
     * Method setMunicipios
     * 
     * 
     * 
     * @param index
     * @param vMunicipios
     */
    public void setMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios vMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _municipiosList.size())) {
            throw new IndexOutOfBoundsException("setMunicipios: Index value '"+index+"' not in range [0.." + (_municipiosList.size() - 1) + "]");
        }
        if (!(index < 720)) {
            throw new IndexOutOfBoundsException("setMunicipios has a maximum of 720");
        }
        _municipiosList.setElementAt(vMunicipios, index);
    } //-- void setMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) 

    /**
     * Method setMunicipios
     * 
     * 
     * 
     * @param municipiosArray
     */
    public void setMunicipios(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios[] municipiosArray)
    {
        //-- copy array
        _municipiosList.removeAllElements();
        for (int i = 0; i < municipiosArray.length; i++) {
            _municipiosList.addElement(municipiosArray[i]);
        }
    } //-- void setMunicipios(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.Municipios) 

    /**
     * Sets the value of field 'terminal'.
     * 
     * @param terminal the value of field 'terminal'.
     */
    public void setTerminal(java.lang.String terminal)
    {
        this._terminal = terminal;
    } //-- void setTerminal(java.lang.String) 

    /**
     * Sets the value of field 'tipoUsuario'.
     * 
     * @param tipoUsuario the value of field 'tipoUsuario'.
     */
    public void setTipoUsuario(java.lang.String tipoUsuario)
    {
        this._tipoUsuario = tipoUsuario;
    } //-- void setTipoUsuario(java.lang.String) 

    /**
     * Sets the value of field 'usuario'.
     * 
     * @param usuario the value of field 'usuario'.
     */
    public void setUsuario(java.lang.String usuario)
    {
        this._usuario = usuario;
    } //-- void setUsuario(java.lang.String) 

    /**
     * Sets the value of field 'usuarioCanal'.
     * 
     * @param usuarioCanal the value of field 'usuarioCanal'.
     */
    public void setUsuarioCanal(java.lang.String usuarioCanal)
    {
        this._usuarioCanal = usuarioCanal;
    } //-- void setUsuarioCanal(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SolicitarReprocessamentoPorMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.request.SolicitarReprocessamentoPorMunicipioRequest unmarshal(java.io.Reader) 

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
