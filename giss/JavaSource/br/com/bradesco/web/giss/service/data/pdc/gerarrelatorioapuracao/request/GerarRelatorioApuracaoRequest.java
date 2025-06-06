/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request;

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
 * Class GerarRelatorioApuracaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class GerarRelatorioApuracaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _dtMesAnoInicio
     */
    private int _dtMesAnoInicio = 0;

    /**
     * keeps track of state for field: _dtMesAnoInicio
     */
    private boolean _has_dtMesAnoInicio;

    /**
     * Field _dtMesAnoFim
     */
    private int _dtMesAnoFim = 0;

    /**
     * keeps track of state for field: _dtMesAnoFim
     */
    private boolean _has_dtMesAnoFim;

    /**
     * Field _listaMunicipiosList
     */
    private java.util.Vector _listaMunicipiosList;

    /**
     * Field _listaEmpresaList
     */
    private java.util.Vector _listaEmpresaList;

    /**
     * Field _codProduto
     */
    private int _codProduto = 0;

    /**
     * keeps track of state for field: _codProduto
     */
    private boolean _has_codProduto;


      //----------------/
     //- Constructors -/
    //----------------/

    public GerarRelatorioApuracaoRequest() 
     {
        super();
        _listaMunicipiosList = new Vector();
        _listaEmpresaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addListaEmpresa
     * 
     * 
     * 
     * @param vListaEmpresa
     */
    public void addListaEmpresa(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa vListaEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEmpresaList.size() < 15)) {
            throw new IndexOutOfBoundsException("addListaEmpresa has a maximum of 15");
        }
        _listaEmpresaList.addElement(vListaEmpresa);
    } //-- void addListaEmpresa(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) 

    /**
     * Method addListaEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaEmpresa
     */
    public void addListaEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa vListaEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaEmpresaList.size() < 15)) {
            throw new IndexOutOfBoundsException("addListaEmpresa has a maximum of 15");
        }
        _listaEmpresaList.insertElementAt(vListaEmpresa, index);
    } //-- void addListaEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) 

    /**
     * Method addListaMunicipios
     * 
     * 
     * 
     * @param vListaMunicipios
     */
    public void addListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosList.size() < 50)) {
            throw new IndexOutOfBoundsException("addListaMunicipios has a maximum of 50");
        }
        _listaMunicipiosList.addElement(vListaMunicipios);
    } //-- void addListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) 

    /**
     * Method addListaMunicipios
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipios
     */
    public void addListaMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaMunicipiosList.size() < 50)) {
            throw new IndexOutOfBoundsException("addListaMunicipios has a maximum of 50");
        }
        _listaMunicipiosList.insertElementAt(vListaMunicipios, index);
    } //-- void addListaMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) 

    /**
     * Method deleteCodProduto
     * 
     */
    public void deleteCodProduto()
    {
        this._has_codProduto= false;
    } //-- void deleteCodProduto() 

    /**
     * Method deleteDtMesAnoFim
     * 
     */
    public void deleteDtMesAnoFim()
    {
        this._has_dtMesAnoFim= false;
    } //-- void deleteDtMesAnoFim() 

    /**
     * Method deleteDtMesAnoInicio
     * 
     */
    public void deleteDtMesAnoInicio()
    {
        this._has_dtMesAnoInicio= false;
    } //-- void deleteDtMesAnoInicio() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateListaEmpresa
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaEmpresa()
    {
        return _listaEmpresaList.elements();
    } //-- java.util.Enumeration enumerateListaEmpresa() 

    /**
     * Method enumerateListaMunicipios
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateListaMunicipios()
    {
        return _listaMunicipiosList.elements();
    } //-- java.util.Enumeration enumerateListaMunicipios() 

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
     * Returns the value of field 'dtMesAnoFim'.
     * 
     * @return int
     * @return the value of field 'dtMesAnoFim'.
     */
    public int getDtMesAnoFim()
    {
        return this._dtMesAnoFim;
    } //-- int getDtMesAnoFim() 

    /**
     * Returns the value of field 'dtMesAnoInicio'.
     * 
     * @return int
     * @return the value of field 'dtMesAnoInicio'.
     */
    public int getDtMesAnoInicio()
    {
        return this._dtMesAnoInicio;
    } //-- int getDtMesAnoInicio() 

    /**
     * Method getListaEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa getListaEmpresa(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEmpresaList.size())) {
            throw new IndexOutOfBoundsException("getListaEmpresa: Index value '"+index+"' not in range [0.."+(_listaEmpresaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) _listaEmpresaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa getListaEmpresa(int) 

    /**
     * Method getListaEmpresa
     * 
     * 
     * 
     * @return ListaEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa[] getListaEmpresa()
    {
        int size = _listaEmpresaList.size();
        br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa[] mArray = new br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) _listaEmpresaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa[] getListaEmpresa() 

    /**
     * Method getListaEmpresaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaEmpresaCount()
    {
        return _listaEmpresaList.size();
    } //-- int getListaEmpresaCount() 

    /**
     * Method getListaMunicipios
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios getListaMunicipios(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("getListaMunicipios: Index value '"+index+"' not in range [0.."+(_listaMunicipiosList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) _listaMunicipiosList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios getListaMunicipios(int) 

    /**
     * Method getListaMunicipios
     * 
     * 
     * 
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios[] getListaMunicipios()
    {
        int size = _listaMunicipiosList.size();
        br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios[] mArray = new br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) _listaMunicipiosList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios[] getListaMunicipios() 

    /**
     * Method getListaMunicipiosCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaMunicipiosCount()
    {
        return _listaMunicipiosList.size();
    } //-- int getListaMunicipiosCount() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

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
     * Method hasDtMesAnoFim
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAnoFim()
    {
        return this._has_dtMesAnoFim;
    } //-- boolean hasDtMesAnoFim() 

    /**
     * Method hasDtMesAnoInicio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAnoInicio()
    {
        return this._has_dtMesAnoInicio;
    } //-- boolean hasDtMesAnoInicio() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

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
     * Method removeAllListaEmpresa
     * 
     */
    public void removeAllListaEmpresa()
    {
        _listaEmpresaList.removeAllElements();
    } //-- void removeAllListaEmpresa() 

    /**
     * Method removeAllListaMunicipios
     * 
     */
    public void removeAllListaMunicipios()
    {
        _listaMunicipiosList.removeAllElements();
    } //-- void removeAllListaMunicipios() 

    /**
     * Method removeListaEmpresa
     * 
     * 
     * 
     * @param index
     * @return ListaEmpresa
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa removeListaEmpresa(int index)
    {
        java.lang.Object obj = _listaEmpresaList.elementAt(index);
        _listaEmpresaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa removeListaEmpresa(int) 

    /**
     * Method removeListaMunicipios
     * 
     * 
     * 
     * @param index
     * @return ListaMunicipios
     */
    public br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios removeListaMunicipios(int index)
    {
        java.lang.Object obj = _listaMunicipiosList.elementAt(index);
        _listaMunicipiosList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios removeListaMunicipios(int) 

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
     * Sets the value of field 'dtMesAnoFim'.
     * 
     * @param dtMesAnoFim the value of field 'dtMesAnoFim'.
     */
    public void setDtMesAnoFim(int dtMesAnoFim)
    {
        this._dtMesAnoFim = dtMesAnoFim;
        this._has_dtMesAnoFim = true;
    } //-- void setDtMesAnoFim(int) 

    /**
     * Sets the value of field 'dtMesAnoInicio'.
     * 
     * @param dtMesAnoInicio the value of field 'dtMesAnoInicio'.
     */
    public void setDtMesAnoInicio(int dtMesAnoInicio)
    {
        this._dtMesAnoInicio = dtMesAnoInicio;
        this._has_dtMesAnoInicio = true;
    } //-- void setDtMesAnoInicio(int) 

    /**
     * Method setListaEmpresa
     * 
     * 
     * 
     * @param index
     * @param vListaEmpresa
     */
    public void setListaEmpresa(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa vListaEmpresa)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaEmpresaList.size())) {
            throw new IndexOutOfBoundsException("setListaEmpresa: Index value '"+index+"' not in range [0.." + (_listaEmpresaList.size() - 1) + "]");
        }
        if (!(index < 15)) {
            throw new IndexOutOfBoundsException("setListaEmpresa has a maximum of 15");
        }
        _listaEmpresaList.setElementAt(vListaEmpresa, index);
    } //-- void setListaEmpresa(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) 

    /**
     * Method setListaEmpresa
     * 
     * 
     * 
     * @param listaEmpresaArray
     */
    public void setListaEmpresa(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa[] listaEmpresaArray)
    {
        //-- copy array
        _listaEmpresaList.removeAllElements();
        for (int i = 0; i < listaEmpresaArray.length; i++) {
            _listaEmpresaList.addElement(listaEmpresaArray[i]);
        }
    } //-- void setListaEmpresa(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaEmpresa) 

    /**
     * Method setListaMunicipios
     * 
     * 
     * 
     * @param index
     * @param vListaMunicipios
     */
    public void setListaMunicipios(int index, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios vListaMunicipios)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaMunicipiosList.size())) {
            throw new IndexOutOfBoundsException("setListaMunicipios: Index value '"+index+"' not in range [0.." + (_listaMunicipiosList.size() - 1) + "]");
        }
        if (!(index < 50)) {
            throw new IndexOutOfBoundsException("setListaMunicipios has a maximum of 50");
        }
        _listaMunicipiosList.setElementAt(vListaMunicipios, index);
    } //-- void setListaMunicipios(int, br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) 

    /**
     * Method setListaMunicipios
     * 
     * 
     * 
     * @param listaMunicipiosArray
     */
    public void setListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios[] listaMunicipiosArray)
    {
        //-- copy array
        _listaMunicipiosList.removeAllElements();
        for (int i = 0; i < listaMunicipiosArray.length; i++) {
            _listaMunicipiosList.addElement(listaMunicipiosArray[i]);
        }
    } //-- void setListaMunicipios(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.ListaMunicipios) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GerarRelatorioApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.request.GerarRelatorioApuracaoRequest unmarshal(java.io.Reader) 

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
