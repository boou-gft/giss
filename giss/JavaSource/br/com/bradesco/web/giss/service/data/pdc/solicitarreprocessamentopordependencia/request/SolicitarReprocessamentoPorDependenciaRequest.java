/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: SolicitarReprocessamentoPorDependenciaRequest.java,v 1.1 2017/04/11 14:09:23 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request;

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
 * Class SolicitarReprocessamentoPorDependenciaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:23 $
 */
public class SolicitarReprocessamentoPorDependenciaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

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
     * Field _dependenciasList
     */
    private java.util.Vector _dependenciasList;

    /**
     * Field _aliquotasList
     */
    private java.util.Vector _aliquotasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SolicitarReprocessamentoPorDependenciaRequest() 
     {
        super();
        _dependenciasList = new Vector();
        _aliquotasList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAliquotas
     * 
     * 
     * 
     * @param vAliquotas
     */
    public void addAliquotas(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas vAliquotas)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_aliquotasList.size() < 50)) {
            throw new IndexOutOfBoundsException("addAliquotas has a maximum of 50");
        }
        _aliquotasList.addElement(vAliquotas);
    } //-- void addAliquotas(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) 

    /**
     * Method addAliquotas
     * 
     * 
     * 
     * @param index
     * @param vAliquotas
     */
    public void addAliquotas(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas vAliquotas)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_aliquotasList.size() < 50)) {
            throw new IndexOutOfBoundsException("addAliquotas has a maximum of 50");
        }
        _aliquotasList.insertElementAt(vAliquotas, index);
    } //-- void addAliquotas(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) 

    /**
     * Method addDependencias
     * 
     * 
     * 
     * @param vDependencias
     */
    public void addDependencias(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias vDependencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_dependenciasList.size() < 100)) {
            throw new IndexOutOfBoundsException("addDependencias has a maximum of 100");
        }
        _dependenciasList.addElement(vDependencias);
    } //-- void addDependencias(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) 

    /**
     * Method addDependencias
     * 
     * 
     * 
     * @param index
     * @param vDependencias
     */
    public void addDependencias(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias vDependencias)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_dependenciasList.size() < 100)) {
            throw new IndexOutOfBoundsException("addDependencias has a maximum of 100");
        }
        _dependenciasList.insertElementAt(vDependencias, index);
    } //-- void addDependencias(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

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
     * Method enumerateAliquotas
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateAliquotas()
    {
        return _aliquotasList.elements();
    } //-- java.util.Enumeration enumerateAliquotas() 

    /**
     * Method enumerateDependencias
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateDependencias()
    {
        return _dependenciasList.elements();
    } //-- java.util.Enumeration enumerateDependencias() 

    /**
     * Method getAliquotas
     * 
     * 
     * 
     * @param index
     * @return Aliquotas
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas getAliquotas(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _aliquotasList.size())) {
            throw new IndexOutOfBoundsException("getAliquotas: Index value '"+index+"' not in range [0.."+(_aliquotasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) _aliquotasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas getAliquotas(int) 

    /**
     * Method getAliquotas
     * 
     * 
     * 
     * @return Aliquotas
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas[] getAliquotas()
    {
        int size = _aliquotasList.size();
        br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas[] mArray = new br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) _aliquotasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas[] getAliquotas() 

    /**
     * Method getAliquotasCount
     * 
     * 
     * 
     * @return int
     */
    public int getAliquotasCount()
    {
        return _aliquotasList.size();
    } //-- int getAliquotasCount() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

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
     * Method getDependencias
     * 
     * 
     * 
     * @param index
     * @return Dependencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias getDependencias(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _dependenciasList.size())) {
            throw new IndexOutOfBoundsException("getDependencias: Index value '"+index+"' not in range [0.."+(_dependenciasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) _dependenciasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias getDependencias(int) 

    /**
     * Method getDependencias
     * 
     * 
     * 
     * @return Dependencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias[] getDependencias()
    {
        int size = _dependenciasList.size();
        br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias[] mArray = new br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) _dependenciasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias[] getDependencias() 

    /**
     * Method getDependenciasCount
     * 
     * 
     * 
     * @return int
     */
    public int getDependenciasCount()
    {
        return _dependenciasList.size();
    } //-- int getDependenciasCount() 

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
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Method removeAliquotas
     * 
     * 
     * 
     * @param index
     * @return Aliquotas
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas removeAliquotas(int index)
    {
        java.lang.Object obj = _aliquotasList.elementAt(index);
        _aliquotasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas removeAliquotas(int) 

    /**
     * Method removeAllAliquotas
     * 
     */
    public void removeAllAliquotas()
    {
        _aliquotasList.removeAllElements();
    } //-- void removeAllAliquotas() 

    /**
     * Method removeAllDependencias
     * 
     */
    public void removeAllDependencias()
    {
        _dependenciasList.removeAllElements();
    } //-- void removeAllDependencias() 

    /**
     * Method removeDependencias
     * 
     * 
     * 
     * @param index
     * @return Dependencias
     */
    public br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias removeDependencias(int index)
    {
        java.lang.Object obj = _dependenciasList.elementAt(index);
        _dependenciasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias removeDependencias(int) 

    /**
     * Method setAliquotas
     * 
     * 
     * 
     * @param index
     * @param vAliquotas
     */
    public void setAliquotas(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas vAliquotas)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _aliquotasList.size())) {
            throw new IndexOutOfBoundsException("setAliquotas: Index value '"+index+"' not in range [0.." + (_aliquotasList.size() - 1) + "]");
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException("setAliquotas has a maximum of 50");
        }
        _aliquotasList.setElementAt(vAliquotas, index);
    } //-- void setAliquotas(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) 

    /**
     * Method setAliquotas
     * 
     * 
     * 
     * @param aliquotasArray
     */
    public void setAliquotas(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas[] aliquotasArray)
    {
        //-- copy array
        _aliquotasList.removeAllElements();
        for (int i = 0; i < aliquotasArray.length; i++) {
            _aliquotasList.addElement(aliquotasArray[i]);
        }
    } //-- void setAliquotas(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Aliquotas) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

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
     * Method setDependencias
     * 
     * 
     * 
     * @param index
     * @param vDependencias
     */
    public void setDependencias(int index, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias vDependencias)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _dependenciasList.size())) {
            throw new IndexOutOfBoundsException("setDependencias: Index value '"+index+"' not in range [0.." + (_dependenciasList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setDependencias has a maximum of 100");
        }
        _dependenciasList.setElementAt(vDependencias, index);
    } //-- void setDependencias(int, br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) 

    /**
     * Method setDependencias
     * 
     * 
     * 
     * @param dependenciasArray
     */
    public void setDependencias(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias[] dependenciasArray)
    {
        //-- copy array
        _dependenciasList.removeAllElements();
        for (int i = 0; i < dependenciasArray.length; i++) {
            _dependenciasList.addElement(dependenciasArray[i]);
        }
    } //-- void setDependencias(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.Dependencias) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return SolicitarReprocessamentoPorDependenciaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.request.SolicitarReprocessamentoPorDependenciaRequest unmarshal(java.io.Reader) 

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
